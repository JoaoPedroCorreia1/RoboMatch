package robomatch;

import models.candidato.cadastro.Habilidade;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RoboMatchTests {

    @Test
    public void obterCandidatoJoaoComSucesso() {
        List<String> emails = RoboMatch.getEmailsMatch(
                Arrays.asList(
                        "analista de segurança da informação"
                ),
                Arrays.asList(
                        "estagiário"
                ),
                Arrays.asList("Híbrido"),
                Arrays.asList("Manhã"),
                Arrays.asList(
                        new Habilidade(
                                "programação",
                                1),
                        new Habilidade(
                                "sql",
                                2)
                )
        );

        Assert.assertEquals(
                emails,
                Arrays.asList("jpmourasilva@gmail.com")
        );

    }

}
