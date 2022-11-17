package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    static final String[] signs = new String[]{"+", "-", "*"};
    static int i;
    public static void calcGame(String userName) {
        String[][] qAndAs = new String[Engine.stage][2];
        String question = "What is the result of the expression?";
        for (i = 0; i < Engine.stage; i++) {
            String sign = signs[i];
            int num1 = Utils.someNum();
            int num2 = Utils.someNum();
            qAndAs[i][0] = num1 + " " + sign + " " + num2;
            qAndAs[i][1] = calculate(num1, num2);
        }
        Engine.braingamesEngine (qAndAs, question, userName);
    }

    public static String calculate(int num1, int num2) {
        int result = switch (i) {
            case 0 -> num1 + num2;
            case 1 -> num1 - num2;
            case 2 -> num1 * num2;
            default -> throw new RuntimeException("Unsupported operation");
        };
        return String.valueOf(result);
    }
}
