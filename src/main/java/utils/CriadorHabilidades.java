package utils;

import models.candidato.cadastro.Habilidade;

import java.util.ArrayList;
import java.util.List;

public class CriadorHabilidades {

    public static List<Habilidade> criar(
            String nenhumas,
            String conceituais,
            String praticas
    ) {
        List<Habilidade> habilidades = new ArrayList<>();

        List<String> nenhuma
                = SeparadorString
                    .separarPorVirgulaEEspaco(nenhumas);

        List<String> conceitual
                = SeparadorString
                .separarPorVirgulaEEspaco(conceituais);

        List<String> pratica
                = SeparadorString
                .separarPorVirgulaEEspaco(praticas);

        if(!nenhuma.get(0).equals("")) {
            for (String habilidadeNome : nenhuma) {
                habilidades.add(
                        new Habilidade(
                                habilidadeNome,
                                0
                        )
                );
            }
        }

        if(!conceitual.get(0).equals("")) {
            for (String habilidadeNome : conceitual) {
                habilidades.add(
                        new Habilidade(
                                habilidadeNome,
                                1
                        )
                );
            }

        }

        if(!pratica.get(0).equals("")) {
            for (String habilidadeNome : pratica) {
                habilidades.add(
                        new Habilidade(
                                habilidadeNome,
                                2
                        )
                );
            }
        }

        return habilidades;
    }

}
