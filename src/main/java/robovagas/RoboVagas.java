package robovagas;

import robomatch.models.candidato.Cadastro;
import robomatch.models.candidato.Vaga;
import sheetapi.service.VagasService;
import utils.SeparadorString;

import java.util.ArrayList;
import java.util.List;

public class RoboVagas {

    public static List<Vaga> obterVagas()
    {

        // obter dados
        List<String> emailColuna
                = VagasService
                .getValoresPorColuna('B');

        List<String> cargosDesejadosColuna
                = VagasService
                .getValoresPorColuna('C');

        List<String> senioridadeColuna
                = VagasService
                .getValoresPorColuna('D');

        List<String> disponibilidadesLocalRemotoColuna
                = VagasService
                .getValoresPorColuna('E');

        List<String> periodosDisponiveisColuna
                = VagasService
                .getValoresPorColuna('F');

        List<Vaga> vagas = new ArrayList<>();

        // iterar por linha
        int quantidadeVagas = emailColuna.size();

        for(int i = 0; i < quantidadeVagas; i++)
        {
            String email = emailColuna.get(i);

            List<String> cargosDesejados
                    = SeparadorString
                    .separarPorVirgulaEEspaco(
                            cargosDesejadosColuna.get(i)
                    );

            String senioridade = senioridadeColuna.get(i);

            List<String> diponibilidadesLocalRemoto
                    = SeparadorString
                    .separarPorVirgulaEEspaco(
                            disponibilidadesLocalRemotoColuna.get(i)
                    );

            List<String> periodosDisponiveis
                    = SeparadorString
                    .separarPorVirgulaEEspaco(
                            periodosDisponiveisColuna.get(i)
                    );

            // para cada valor
            vagas.add(
                    new Vaga(
                            email,

                            cargosDesejados,
                            senioridade,
                            diponibilidadesLocalRemoto,
                            periodosDisponiveis
                    )
            );
        }

        return vagas;

    }

}
