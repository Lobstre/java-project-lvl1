package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    static final String[] SIGNS = new String[]{"+", "-", "*"};

    public static void calcGame() {
        String[][] qAndAs = new String[Engine.STAGE][2];
        String question = "What is the result of the expression?";
        for (int i = 0; i < Engine.STAGE; i++) {
            String sign = SIGNS[i];
            int num1 = Utils.someNum();
            int num2 = Utils.someNum();
            qAndAs[i][0] = num1 + " " + sign + " " + num2;
            qAndAs[i][1] = calculate(num1, num2, sign);
        }
        Engine.braingamesEngine(qAndAs, question);
    }

    public static String calculate(int num1, int num2, String sign) {
        int result = switch (sign) {
            case ("+") -> num1 + num2;
            case ("-") -> num1 - num2;
            case ("*") -> num1 * num2;
            default -> throw new RuntimeException("Unsupported operation");
        };
        return String.valueOf(result);
    }
}
