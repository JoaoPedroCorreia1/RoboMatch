package robomatch.utils.filtros.vagas;

import java.util.ArrayList;
import java.util.List;

import models.Candidato;
import models.candidato.Vaga;

public class FiltradorPorCargos {

    public static List<Candidato> filtrar(
            List<String> cargosParaFiltrar,
            List<Candidato> candidatos) {
        List<Candidato> selecionados = new ArrayList<>();

        for (Candidato candidato : candidatos) {

            Candidato candidatoSelecionado = filtrarCandidatoPorCargos(
                    cargosParaFiltrar,
                    candidato);

            if (candidatoSelecionado != null) {
                selecionados.add(candidatoSelecionado);
            }

        }

        return selecionados;
    }

    private static Candidato filtrarCandidatoPorCargos(
            List<String> cargosParaFiltrar,
            Candidato candidato) {

        for (String cargoParaFiltrar : cargosParaFiltrar) {

            for (Vaga vaga : candidato
                    .getVagas()) {

                for (String cargoDesejado : vaga.getCargosDejesados()) {

                    if (cargoDesejado
                            .equalsIgnoreCase(cargoParaFiltrar)) {

                        return candidato;

                    }

                }

            }
        }

        return null;
    }

}
