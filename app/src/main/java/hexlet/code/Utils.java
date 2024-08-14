package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }
}
