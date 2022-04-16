package sheetapi.clients;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.auth.Credentials;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;

public class SheetClient {

    // Credenciais
    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final GsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();

    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String PATH_PROJETO = System.getProperty("user.dir");
    private static final String CREDENTIALS_FILE_PATH = PATH_PROJETO + "/src/credentials.json";

    // Métodos Públicos
    public static List<String> getValoresPorColuna(
            char coluna,
            String spreadsheetId) {
        String range = "!" + coluna + ":" + coluna;

        List<String> valoresColuna = getValores(
                range,
                spreadsheetId);

        valoresColuna.remove(0);

        return valoresColuna;
    }

    public static String getValorCelula(
            char posicao,
            int indice,
            String spreadsheetId) {
        String range = "!" + posicao + indice;

        List<String> valores = getValores(
                range,
                spreadsheetId);

        String valor = "";
        if (!valores.isEmpty()) {
            valor = valores.get(0);
        }

        return valor;
    }

    private static List<String> getValores(
            String range,
            String spreadsheetId) {
        List<String> strs = new ArrayList<>();

        try {
            ValueRange response = getService().spreadsheets().values()
                    .get(
                            spreadsheetId,
                            range)
                    .execute();

            List<List<Object>> values = response.getValues();

            if (values == null || values.isEmpty()) {

            } else {

                for (List<Object> row : values) {

                    Iterator<Object> iterator = row.listIterator();

                    while (iterator.hasNext()) {

                        strs.add((String) iterator.next());

                    }

                }
            }

        } catch (Exception e) {

        }

        return strs;

    }

    /**
     * @param
     * @return
     * @throws IOException
     */
    private static Credentials getCredentials() throws IOException {

        // Load client secrets.
        InputStream in = new FileInputStream(CREDENTIALS_FILE_PATH);

        // **
        GoogleCredentials credentials = ServiceAccountCredentials.fromStream(in).createScoped(SCOPES);

        // **
        return credentials;
    }

    private static Sheets getService() throws GeneralSecurityException, IOException {

        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();

        HttpRequestInitializer requestInitializer = new HttpCredentialsAdapter(getCredentials());

        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, requestInitializer)
                .setApplicationName(APPLICATION_NAME).build();

        return service;

    }

}