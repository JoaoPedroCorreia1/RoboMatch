package robomatch;

import robomatch.models.Candidato;
import robomatch.models.candidato.cadastro.Habilidade;
import robomatch.utils.filtros.cadastros.FiltradorPorPeriodo;
import robomatch.utils.filtros.vagas.FiltradorPorLocalRemoto;
import robomatch.utils.filtros.vagas.FiltradorPorSenioridade;
import testsresources.CriadorListaCandidatoFalso;
import robomatch.utils.filtros.vagas.FiltradorPorCargo;
import robomatch.utils.filtros.cadastros.FiltradorPorHabilidade;

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

        List<Candidato> candidatos = CriadorListaCandidatoFalso.criar();

        List<Candidato> selecionados = new ArrayList<Candidato>();

        // filtrar por cargo
        for (String cargoFiltrar : cargosFiltrar) {

            selecionados = FiltradorPorCargo.filtrar(
                    cargoFiltrar,
                    candidatos
            );

        }

        // filtrar por senioridade
        for (String senioridadeFiltrar : senioridadesFiltrar)
        {

            selecionados = FiltradorPorSenioridade.filtrar(
                    senioridadeFiltrar,
                    candidatos
            );

        }

        // filtrar por local/remoto
        for (String disponibilidadeLocalRemotoFiltrar
                : disponibilidadesLocalRemotoFiltrar)
        {

            selecionados = FiltradorPorLocalRemoto.filtrar(
                    disponibilidadeLocalRemotoFiltrar,
                    candidatos
            );

        }

        // filtrar por período
        for (String disponibilidadePeriodoFiltrar
                : disponibilidadesPeriodoFiltrar)
        {

            selecionados = FiltradorPorPeriodo.filtrar(
                    disponibilidadePeriodoFiltrar,
                    candidatos
            );

        }

        // filtrar por habilidade
        for(Habilidade habilidadeFiltrar : habilidadesFiltrar)
        {

            selecionados = FiltradorPorHabilidade.filtrar(
                    habilidadeFiltrar,
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
