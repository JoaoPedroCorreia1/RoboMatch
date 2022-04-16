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
     * getMatch
     * 
     * - Para Não Filtrar:
     * 
     * - valor = null
     */
    public static List<String> getMatch(
            List<String> cargosFiltrar,

            List<String> senioridadesFiltrar,

            List<String> disponibilidadesLocalRemotoFiltrar,

            List<String> disponibilidadesPeriodoFiltrar,

            List<Habilidade> habilidadesFiltrar) {
        // obter dados do googlesheet
        List<Candidato> selecionados = RoboCandidatos.getCandidatos();

        // filtrar
        selecionados = FiltradorPorCargos.filtrar(
                cargosFiltrar,
                selecionados);

        selecionados = FiltradorPorSenioridades.filtrar(
                    senioridadesFiltrar,
                    selecionados);

        selecionados = FiltradorPorLocalRemoto.filtrar(
            disponibilidadesLocalRemotoFiltrar,
            selecionados);

        selecionados = FiltradorPorPeriodos.filtrar(
            disponibilidadesPeriodoFiltrar,
            selecionados);

        selecionados = FiltradorPorHabilidades.filtrar(
            habilidadesFiltrar,
            selecionados);

        // obter emails
        List<String> emailsSelecionados = new ArrayList<String>();

        for (Candidato c : selecionados) {
            String email = c.getCadastro().getEmail();
            emailsSelecionados.add(email);
        }

        return emailsSelecionados;
    }

}
