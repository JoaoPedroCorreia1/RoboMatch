package sheetapi.service;

import sheetapi.clients.SheetClient;

import java.util.ArrayList;
import java.util.List;

public class CandidatosService {

    private static final String planilhaCandidatosId = "1opDGLGL_qSQ7KX-1GG_OUtemk0WCS3z6OQ3Gy2itCfg";

    public static List<String> getValoresPorColuna(
            char coluna
    ) {

        try {

            return SheetClient
                    .getValoresPorColuna(
                          coluna,
                          planilhaCandidatosId
                    );

        } catch (Exception e) {

            return new ArrayList<>();

        }

    }

}
