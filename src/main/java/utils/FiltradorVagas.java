package utils;

import models.candidato.Vaga;

import java.util.ArrayList;
import java.util.List;

public class FiltradorVagas {

    public static List<Vaga> filtrarPorEmail(
            String email,
            List<Vaga> vagas) {
        List<Vaga> selecionadas = new ArrayList<>();

        for (Vaga vaga : vagas) {

            if (vaga.getEmail().equals(email)) {
                selecionadas.add(vaga);
            }

        }

        return selecionadas;

    }
}
