package robovagas;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import models.candidato.Vaga;

public class RoboVagasTests {

    @Test
    public void obterVagasComSucesso() {
        List<Vaga> vagas = RoboVagas.obterVagas();

        int i = 1;
        for (Vaga vaga : vagas) {
            System.out.println("####### Vaga " + i + "#######");
            System.out.println(vaga.getEmail());
            System.out.println(vaga.getCargosDejesados());
            System.out.println(vaga.getSenioridade());
            System.out.println(vaga.getDisponibilidadeLocalRemoto());
            System.out.println(vaga.getPeriodosDisponiveis());
            i++;
        }

        Assert.assertNotNull(vagas);
    }

}
