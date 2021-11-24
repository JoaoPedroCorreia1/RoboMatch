package robomatch.utils.filtros.cadastros;

import java.util.ArrayList;
import java.util.List;

import robomatch.models.Candidato;
import robomatch.models.candidato.cadastro.Habilidade;

public class FiltradorPorHabilidade {
    
    public static List<Candidato> filtrar(
        Habilidade habilidadeParaFiltrar, 
        List<Candidato> candidatos
    ) {

        List<Candidato> selecionados = new ArrayList<Candidato>();

        if(habilidadeParaFiltrar.getNivel() == 0)
        {
            return candidatos;
        }
        
        for (Candidato candidato : candidatos)
        {

            for (Habilidade habilidade
                    : candidato
                        .getCadastro()
                        .getHabilidades()
            ) {

                // checar nome
                if (habilidade.getNome()
                        .equalsIgnoreCase(
                        habilidadeParaFiltrar.getNome()
                        )
                )
                {

                    // checar nível
                    if (habilidade.getNivel()
                            >= habilidadeParaFiltrar.getNivel()
                    ) {

                        selecionados.add(candidato);

                    }

                }

            }

        }

        return selecionados;
        
    }

}
