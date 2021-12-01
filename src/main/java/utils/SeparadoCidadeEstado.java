package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparadoCidadeEstado {

    public static List<String> obterCidadeEstado(
            String cidadeEstado
    )
    {
        List<String> elementos = new ArrayList<>();

        cidadeEstado = cidadeEstado.replace(" ", "");

        if(cidadeEstado.contains("/")) {
            elementos
                    = Arrays.asList(
                            cidadeEstado.split("/")
            );
        } else {
            elementos.add("");
            elementos.add("");
        }

        return elementos;
    }

}
