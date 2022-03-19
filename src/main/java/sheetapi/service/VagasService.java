package sheetapi.service;

import sheetapi.clients.SheetClient;

import java.util.ArrayList;
import java.util.List;

public class VagasService {

    private static final String planilhaVagasId = "1b7e2vLTSFWbcISKsJ02R7HLxv8mMId7N7UiPz8C2YrM";

    // public

    public static List<String> getValoresPorColuna(
            char coluna) {
        List<String> valores = new ArrayList<>();

        try {
            valores = SheetClient
                    .getValoresPorColuna(coluna, planilhaVagasId);
        } catch (Exception e) {
            System.out.println(e);
        }

        return valores;
    }
}
