package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {

    public static void evenGame() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] qAndAs = new String[Engine.STAGE][2];
        for (int i = 0; i < qAndAs.length; i++) {
            int isEvenNum = Utils.someNum();
            qAndAs[i][0] = String.valueOf(isEvenNum);
            qAndAs[i][1] = (isEven(isEvenNum) ? "yes" : "no");
        }

        Engine.braingamesEngine(qAndAs, question);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
