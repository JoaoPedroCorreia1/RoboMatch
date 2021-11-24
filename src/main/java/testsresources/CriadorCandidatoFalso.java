package testsresources;

import java.util.List;

import robomatch.models.Candidato;
import robomatch.models.candidato.cadastro.Habilidade;

public class CriadorCandidatoFalso {

    public static List<Candidato> adicionarCandidato(
        List<Candidato> candidatos,
        String email,
        List<String> cargosDesejados,
        List<Habilidade> habilidades
    )
    {
         /*
        Candidato c = new Candidato(
            email,
            cargosDesejados,
            habilidades
        );
        */

        candidatos.add(null);

        return null;

    }
    
}
