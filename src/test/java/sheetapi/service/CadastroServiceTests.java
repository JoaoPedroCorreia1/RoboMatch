package sheetapi.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import utils.TestUtilsService;

public class CadastroServiceTests {

    @Test
    public void obterColunaDeEmailsComSucesso() {
        List<String> list = CadastrosService.getEmailColuna();

        assertTrue(TestUtilsService.eEmail(list));
    }
    
}
