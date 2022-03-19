package robocandidatos;

import models.Candidato;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

public class RoboCandidatosTests {

    @Test
    public void obterCanditatosComSucesso() {
        List<Candidato> candidatos = RoboCandidatos.getCandidatos();

        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
        }

        assertNotNull(candidatos);
    }

}
