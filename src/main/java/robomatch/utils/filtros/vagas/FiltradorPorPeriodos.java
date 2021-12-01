package robomatch.utils.filtros.vagas;

import models.Candidato;
import models.candidato.Vaga;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorPeriodos {

    public static List<Candidato> filtrar(
            List<String> periodosDisponiveisFiltrar,
            List<Candidato> candidatos
    ) {

        List<Candidato> selecionados = new ArrayList<Candidato>();

        for (Candidato candidato: candidatos)
        {

            Candidato candidatoSelecionado = filtrarCandidatoPorPeriodos(
                    periodosDisponiveisFiltrar,
                    candidato
            );

            if(candidatoSelecionado != null)
            {
                selecionados.add(candidatoSelecionado);
            }

        }

        return selecionados;

    }

    private static Candidato filtrarCandidatoPorPeriodos(
            List<String> periodosDisponiveisFiltrar,
            Candidato candidato
    ) {

        for (Vaga vaga: candidato.getVagas())
        {

            for(String periodoDisponivel
                    : vaga
                    .getPeriodosDisponiveis()

            ) {

                for(String periodoDisponivelFiltrar
                        : periodosDisponiveisFiltrar
                ) {

                    if (periodoDisponivel
                            .equalsIgnoreCase(periodoDisponivelFiltrar)
                    ) {

                        return candidato;

                    }

                }

            }

        }

        return null;
    }
}
