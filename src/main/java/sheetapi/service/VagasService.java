package sheetapi.service;

import sheetapi.clients.SheetClient;

import java.util.ArrayList;
import java.util.List;

public class VagasService {

    private static final String planilhaVagasId = "1b7e2vLTSFWbcISKsJ02R7HLxv8mMId7N7UiPz8C2YrM";

    // public

    public static List<String> getValoresPorColuna(
            char coluna
    ) {

        try {

            return SheetClient
                    .getValoresPorColuna(
                            coluna,
                            planilhaVagasId
                    );

        } catch (Exception e) {

            return new ArrayList<>();

        }

    }
}
