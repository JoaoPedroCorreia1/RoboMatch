package utils;

import java.util.Arrays;
import java.util.List;

public class SeparadorString {

    public static List<String> separarPorVirgulaEEspaco(String string)
    {
        // remover espaço após virgula
        string = string.replace(", ", ",");

        // dividir por virgula
        List<String> strs = Arrays.asList( string.split(",") );

        return strs;
    }

}
