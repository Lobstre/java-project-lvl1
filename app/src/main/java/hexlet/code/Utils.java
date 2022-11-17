package hexlet.code;

import java.util.Random;

public class Utils {
    static final int HUNDRED = 100;
    public static int someNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

        public static int someNum() {
        return someNum(0, HUNDRED);
    }
}
