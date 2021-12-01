package robocandidatos;

import models.Candidato;
import org.junit.Test;

import java.util.List;

public class RoboCandidatosTeste {

    @Test
    public void testar()
    {
        List<Candidato> candidatos = RoboCandidatos.getCandidatos();

        for(Candidato candidato : candidatos)
        {
            System.out.println(candidato);
        }

    }

}
