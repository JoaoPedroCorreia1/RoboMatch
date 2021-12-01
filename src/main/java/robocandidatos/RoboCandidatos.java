package robocandidatos;

import models.Candidato;
import models.candidato.Cadastro;
import models.candidato.Vaga;
import robocadastros.RoboCadastros;
import robovagas.RoboVagas;
import utils.FiltradorVagas;

import java.util.ArrayList;
import java.util.List;

public class RoboCandidatos {

    public static List<Candidato> getCandidatos()
    {
        List<Candidato> candidatos = new ArrayList<>();

        // obter dados
        List<Cadastro> casdastrosTotal
                = RoboCadastros.obterCadastros();

        List<Vaga> vagasTotal
                = RoboVagas.obterVagas();

        for(Cadastro cadastro : casdastrosTotal)
        {
            String emailAtual = cadastro.getEmail();

            List<Vaga> vagasDoCadastro
                    = FiltradorVagas
                          .filtrarPorEmail(
                                  emailAtual,
                                  vagasTotal
                          );

            candidatos.add(
                    new Candidato(
                            cadastro,
                            vagasDoCadastro
                    )
            );

        }

        return candidatos;

    }

}
