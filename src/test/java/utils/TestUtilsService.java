package utils;

import java.util.List;

public class TestUtilsService {

    public static boolean eEmail(List<String> emails) {
        for (String email : emails) {
            if (email.contains("@") || email.contains(".com")) {
                return true;
            }
        }
        return false;
    }

}