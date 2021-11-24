package robomatch.utils.filtros.vagas;

import java.util.ArrayList;
import java.util.List;

import robomatch.models.Candidato;
import robomatch.models.candidato.Vaga;

public class FiltradorPorCargo {

    public static List<Candidato> filtrar(
        String cargoParaFiltrar, 
        List<Candidato> candidatos
    ) {
        List<Candidato> selecionados = new ArrayList<Candidato>();

        for (Candidato candidato : candidatos)
        {

            for (Vaga vaga
                    : candidato
                        .getVagas())
            {

                for(String cargoDesejado
                        : vaga.getCargosDejesados())
                {

                    if (cargoDesejado
                            .equalsIgnoreCase(cargoParaFiltrar)
                    )
                    {

                        selecionados.add(candidato);

                    }

                }

            }

        }

        return selecionados;
    }
    
}
