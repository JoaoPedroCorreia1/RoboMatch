package testsresources;

import java.util.List;

import models.Candidato;
import models.candidato.cadastro.Habilidade;

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
