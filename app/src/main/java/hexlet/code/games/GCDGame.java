package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class GCDGame {

    public static void gcdGame(String userName) {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] qAndAs = new String[Engine.STAGE][2];
        for (int i = 0; i < qAndAs.length; i++) {
            int num1 = Utils.someNum();
            int num2 = Utils.someNum();

            qAndAs[i][0] = num1 + " " + num2;
            qAndAs[i][1] = gcdIs(num1, num2);
        }

        Engine.braingamesEngine(qAndAs, question, userName);
    }
    public static String gcdIs(int number1, int number2) {
        while (number2 != 0) {
            int mod = number1 % number2;
            number1 = number2;
            number2 = mod;
        }
        return String.valueOf(number1);
    }
}
