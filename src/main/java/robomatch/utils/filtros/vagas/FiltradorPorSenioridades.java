package robomatch.utils.filtros.vagas;

import models.Candidato;
import models.candidato.Vaga;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorSenioridades {

    public static List<Candidato> filtrar(
            List<String> senioridadesParaFiltrar,
            List<Candidato> candidatos) {
        if(senioridadesParaFiltrar.isEmpty()) {
            return candidatos;
        }
        
        List<Candidato> selecionados = new ArrayList<Candidato>();

        for (Candidato candidato : candidatos) {
            Candidato candidatoSelecionado = filtrarCandidatoPorSenioridades(
                    senioridadesParaFiltrar,
                    candidato);

            if (candidatoSelecionado != null) {
                selecionados.add(candidato);
            }

        }

        return selecionados;
    }

    private static Candidato filtrarCandidatoPorSenioridades(
            List<String> senioridadesParaFiltrar,
            Candidato candidato) {
        for (Vaga vaga : candidato
                .getVagas()) {

            for (String senioridadeParaFiltrar : senioridadesParaFiltrar) {

                if (vaga.getSenioridade()
                        .equalsIgnoreCase(senioridadeParaFiltrar)) {

                    return candidato;

                }

            }

        }

        return null;
    }

}
