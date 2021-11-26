package robomatch.utils.filtros.vagas;

import robomatch.models.Candidato;
import robomatch.models.candidato.Vaga;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorSenioridade {

    public static List<Candidato> filtrar(
            String senioridadeParaFiltrar,
            List<Candidato> candidatos
    ) {
        List<Candidato> selecionados = new ArrayList<Candidato>();

        for (Candidato candidato: candidatos)
        {

            for (Vaga vaga
                    : candidato
                        .getVagas())
            {

                if (vaga.getSenioridade()
                        .equalsIgnoreCase(senioridadeParaFiltrar)
                ) {

                    selecionados.add(candidato);

                }

            }

        }

        return selecionados;
    }

}
