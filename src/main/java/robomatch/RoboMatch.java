package robomatch;

import models.Candidato;
import models.candidato.cadastro.Habilidade;
import robocandidatos.RoboCandidatos;
import robomatch.utils.filtros.vagas.FiltradorPorPeriodos;
import robomatch.utils.filtros.vagas.FiltradorPorLocalRemoto;
import robomatch.utils.filtros.vagas.FiltradorPorSenioridades;
import robomatch.utils.filtros.vagas.FiltradorPorCargos;
import robomatch.utils.filtros.cadastros.FiltradorPorHabilidades;

import java.util.ArrayList;
import java.util.List;

public class RoboMatch {

    /*
    getMatch

        - não filtrar

            - List<String> = null

            - List<Habilidade> = null

    */
    public static List<String> getEmailsMatch(
            List<String> cargosFiltrar,

            List<String> senioridadesFiltrar,

            List<String> disponibilidadesLocalRemotoFiltrar,

            List<String> disponibilidadesPeriodoFiltrar,

            List<Habilidade> habilidadesFiltrar
    ) {

        List<Candidato> selecionados = RoboCandidatos.getCandidatos();

        // filtrar por cargo
        if(cargosFiltrar != null)
        {

            selecionados = FiltradorPorCargos.filtrar(
                    cargosFiltrar,
                    selecionados
            );

        }

        // filtrar por senioridade
        if(senioridadesFiltrar != null)
        {

            selecionados = FiltradorPorSenioridades.filtrar(
                    senioridadesFiltrar,
                    selecionados

            );
        }

        // filtrar por local/remoto
        if(disponibilidadesLocalRemotoFiltrar != null)
        {

            selecionados = FiltradorPorLocalRemoto.filtrar(
                    disponibilidadesLocalRemotoFiltrar,
                    selecionados

            );
        }

        // filtrar por período
        if(disponibilidadesPeriodoFiltrar != null)
        {

            selecionados = FiltradorPorPeriodos.filtrar(
                    disponibilidadesPeriodoFiltrar,
                    selecionados
            );

        }

        // filtrar por habilidade
        if(habilidadesFiltrar != null) {

            selecionados = FiltradorPorHabilidades.filtrar(
                    habilidadesFiltrar,
                    selecionados
            );

        }

        // obter emails
        List<String> emailsSelecionados = new ArrayList<String>();

        for(Candidato c : selecionados)
        {
            String email = c.getCadastro().getEmail();
            emailsSelecionados.add(email);
        }

        // retornar emails
        return emailsSelecionados;

    }

}
