package robomatch.utils.filtros.vagas;

import models.Candidato;
import models.candidato.Vaga;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorLocalRemoto {

    public static List<Candidato> filtrar(
            List<String> localRemotoParaFiltrar,
            List<Candidato> candidatos) {
        List<Candidato> selecionados = new ArrayList<Candidato>();

        for (Candidato candidato : candidatos) {

            Candidato candidatoSelecionado = filtrarCandidatoPorCargos(
                    localRemotoParaFiltrar,
                    candidato);

            if (candidatoSelecionado != null) {
                selecionados.add(candidatoSelecionado);
            }

        }

        return selecionados;
    }

    private static Candidato filtrarCandidatoPorCargos(
            List<String> localRemotoParaFiltrar,
            Candidato candidato) {

        for (Vaga vaga : candidato.getVagas()) {

            for (String localRemoto : vaga
                    .getDisponibilidadeLocalRemoto()

            ) {

                for (String localRemotoParaFiltrarSingular : localRemotoParaFiltrar) {

                    if (localRemoto
                            .equalsIgnoreCase(localRemotoParaFiltrarSingular)) {

                        return candidato;

                    }

                }

            }

        }

        return null;
    }
}
