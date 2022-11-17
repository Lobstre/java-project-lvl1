package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {

    public static void evenGame(String userName) {

        String[][] qAndAs = new String[Engine.stage][2];
        for (int i = 0; i < qAndAs.length; i++) {
            int question = Utils.someNum();
            qAndAs[i][0] = String.valueOf(question);
            qAndAs[i][1] = (isEven(question) ? "yes" : "no");
        }

        Engine.braingamesEngine(qAndAs, "Answer 'yes' if the number is even, otherwise answer 'no'.", userName);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
