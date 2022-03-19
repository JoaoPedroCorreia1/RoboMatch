package sheetapi.service;

import models.candidato.cadastro.Habilidade;
import sheetapi.clients.SheetClient;
import utils.CriadorHabilidades;
import utils.SeparadorString;

import java.util.ArrayList;
import java.util.List;

public class CadastrosService {

    private static final String planilhaCandidatosId = "1opDGLGL_qSQ7KX-1GG_OUtemk0WCS3z6OQ3Gy2itCfg";

    public static List<String> getEmailColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('B', planilhaCandidatosId);
        return valores;
    }

    public static List<String> getNomeColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('C', planilhaCandidatosId);
        return valores;
    }

    public static List<String> getLinkedinColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('D', planilhaCandidatosId);
        return valores;
    }

    public static List<String> getSenioridadePreferencialColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('E', planilhaCandidatosId);
        return valores;
    }

    public static List<String> getCidadeEstadoColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('F', planilhaCandidatosId);
        return valores;
    }

    public static List<String> getHabilidadeNenhumaColuna(
            int quantidadeLinhas) {
        List<String> valores = new ArrayList<>();

        for (int l = 2; l < quantidadeLinhas + 2; l++) // começa na linha 2
        {
            String valorLinha = SheetClient.getValorCelula(
                    'G',
                    l,
                    planilhaCandidatosId);

            valores.add(valorLinha);

        }

        return valores;
    }

    public static List<String> getHabilidadeConceitualColuna(
            int quantidadeLinhas) {
        List<String> valores = new ArrayList<>();

        for (int l = 2; l < quantidadeLinhas + 2; l++) {
            String valorLinha = SheetClient.getValorCelula(
                    'H',
                    l,
                    planilhaCandidatosId);

            valores.add(valorLinha);

        }

        return valores;
    }

    public static List<String> getHabilidadePraticanteColuna(
            int quantidadeLinhas) {
        List<String> valores = new ArrayList<>();

        for (int l = 2; l < quantidadeLinhas + 2; l++) {
            String valorLinha = SheetClient.getValorCelula(
                    'I',
                    l,
                    planilhaCandidatosId);

            valores.add(valorLinha);

        }

        return valores;
    }

    public static List<String> getFormacaoColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('J', planilhaCandidatosId);
        return valores;
    }

    public static List<String> getCurriculoColuna() {
        List<String> valores = SheetClient
                .getValoresPorColuna('K', planilhaCandidatosId);
        return valores;
    }

}
