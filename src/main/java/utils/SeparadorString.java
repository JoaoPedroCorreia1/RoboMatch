package utils;

import java.util.Arrays;
import java.util.List;

public class SeparadorString {

    public static List<String> separarPorVirgulaEEspaco(String str) {
        // remover espaço após virgula
        str = str.replace(", ", ",");

        // separar por vírgula
        List<String> strs = Arrays.asList(str.split(","));

        return strs;
    }

}
