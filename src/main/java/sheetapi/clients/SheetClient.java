package sheetapi.clients;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.*;

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
    private static final String PATH_PROJETO = System.getProperty("user.dir");;
    private static final String CREDENTIALS_FILE_PATH = PATH_PROJETO + "/src/credentials.json";

    // Métodos Públicos
    public static List<String> getValoresPorColuna(
            char coluna,
            String spreadsheetId
    ) throws
            IOException,
            GeneralSecurityException
    {
        String range = "!" + coluna + ":" + coluna;

        ValueRange response = getService().spreadsheets().values().get(spreadsheetId, range).execute();

        List<List<Object>> values = response.getValues();

        List<String> strs = new ArrayList<>();

        if (values == null || values.isEmpty()) {

        } else {

            for (List row : values) {

                Iterator iterator = row.listIterator();

                while (iterator.hasNext()) {

                    strs.add((String) iterator.next());

                }

            }
        }

        strs.remove(0);

        return strs;

    }

    /**
     *
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