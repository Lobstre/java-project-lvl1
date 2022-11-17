package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    static final String[] SIGNS = new String[]{"+", "-", "*"};

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        CalcGame.i = i;
    }

    private static int i;

    public static void calcGame(String userName) {
        String[][] qAndAs = new String[Engine.STAGE][2];
        String question = "What is the result of the expression?";
        while (i < Engine.STAGE) {
            String sign = SIGNS[getI()];
            int num1 = Utils.someNum();
            int num2 = Utils.someNum();
            qAndAs[i][0] = num1 + " " + sign + " " + num2;
            qAndAs[i][1] = calculate(num1, num2);
            i++;
        }
        Engine.braingamesEngine (qAndAs, question, userName);
    }

    public static String calculate(int num1, int num2) {
        int result = switch (getI()) {
            case 0 -> num1 + num2;
            case 1 -> num1 - num2;
            case 2 -> num1 * num2;
            default -> throw new RuntimeException("Unsupported operation");
        };
        return String.valueOf(result);
    }
}
