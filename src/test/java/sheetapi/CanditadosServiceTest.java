package sheetapi;

import sheetapi.service.CandidatosService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class CanditadosServiceTest
{

    public static void main(String... args) throws IOException, GeneralSecurityException {

        char[] colunas = {
                'a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l'
        };

        for(int c = 0; c < colunas.length; c++)
        {
            testarColuna(colunas[c]);
        }

    }

    @Test
    private static void testarColuna(
            char coluna
    )
    {
        List<String> strs = CandidatosService.getValoresPorColuna(
                coluna
        );

        for(String str: strs)
        {
            System.out.println(str);
        }

        Assert.assertNotNull(strs);

    }

}
