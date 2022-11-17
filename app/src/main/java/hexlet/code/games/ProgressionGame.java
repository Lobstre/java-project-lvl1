package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    static final int SHORTEST = 5;
    static final int LONGEST = 20;
    static final int LIMIT = 10;
    public static void progressionGame(String userName) {
        String[][] qAndAs = new String[Engine.STAGE][2];
        String question = "What number is missing in the progression?";
        for (int i = 0; i < qAndAs.length; i++) {
            int start = Utils.someNum();
            int finish = Utils.someNum(SHORTEST, LONGEST);
            int step = Utils.someNum(1, LIMIT);
            int[] numbers = progression(start, finish, step);
            int qNum = Utils.someNum(0, numbers.length - 1);
            qAndAs[i][0] = makeQuestion(numbers, qNum);
            qAndAs[i][1] = String.valueOf(numbers[qNum]);
        }
        Engine.braingamesEngine(qAndAs, question, userName);
    }

    public static int[] progression(int start, int finish, int step) {
        int[] numbers = new int[finish];
        numbers[0] = start;
        for (int j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + step;
        }
        return numbers;
    }

    public static String makeQuestion(int[] numbers, int qNum) {
        StringBuilder newString = new StringBuilder();
        if (qNum == 0) {
            newString.append("..");
        } else {
            newString.append(numbers[0]);
        }
        for (int i = 1; i < numbers.length; i++) {
            if (i == qNum) {
                newString.append(" ..");
                continue;
            }
            newString.append(" ").append(numbers[i]);
        }
        return String.valueOf(newString);
    }
}
