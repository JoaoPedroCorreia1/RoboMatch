package robomatch.utils.filtros.cadastros;

import java.util.ArrayList;
import java.util.List;

import models.Candidato;
import models.candidato.cadastro.Habilidade;

public class FiltradorPorHabilidades {

    public static List<Candidato> filtrar(
            List<Habilidade> habilidadesParaFiltrar,
            List<Candidato> candidatos) {
        List<Candidato> selecionados = new ArrayList<Candidato>();

        for (Candidato candidato : candidatos) {
            Candidato candidatoSelecionado = filtrarCandidatoPorHabilidades(
                    habilidadesParaFiltrar,
                    candidato);

            if (candidatoSelecionado != null) {
                selecionados.add(candidato);
            }

        }

        return selecionados;
    }

    private static Candidato filtrarCandidatoPorHabilidades(
            List<Habilidade> habilidadesParaFiltrar,
            Candidato candidato) {
        for (Habilidade habilidade : candidato
                .getCadastro()
                .getHabilidades()) {

            // checar habilidade
            if (!eSuperior(
                    habilidade,
                    habilidadesParaFiltrar)) {

                return null;

            }

        }

        return candidato;
    }

    private static boolean eSuperior(
            Habilidade habilidade,
            List<Habilidade> habilidadesParaFiltrar) {

        for (Habilidade habilidadeParaFiltrar : habilidadesParaFiltrar) {

            if (habilidade.getNome()
                    .equalsIgnoreCase(
                            habilidadeParaFiltrar.getNome())) {

                // checar nível
                if (habilidade.getNivel() < habilidadeParaFiltrar.getNivel()) {

                    return false;

                }

            }

        }

        return true;
    }
}
