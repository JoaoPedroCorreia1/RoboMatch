package robomatch.utils.filtros.cadastros;

import robomatch.models.Candidato;
import robomatch.models.candidato.Vaga;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorPeriodo {

    public static List<Candidato> filtrar(
            String periodoDisponivelFiltrar,
            List<Candidato> candidatos
    ) {

        List<Candidato> selecionados = new ArrayList<Candidato>();

        if(periodoDisponivelFiltrar
                == null
        ) {
            return candidatos;
        }

        for (Candidato candidato : candidatos)
        {

            for (Vaga vaga
                    : candidato
                        .getVagas()
            ) {

                for(String periodoDisponivel
                        : vaga
                            .getPeriodosDisponiveis()
                ) {

                    if (periodoDisponivel
                            .equalsIgnoreCase(
                                    periodoDisponivelFiltrar
                            )
                    ) {

                        selecionados.add(candidato);

                    }

                }

            }

        }

        return selecionados;

    }
    
}
