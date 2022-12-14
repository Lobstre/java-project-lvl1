package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class PrimeGame {
    static final int THREE = 3;

    public static void primeGame() {
        String[][] qAndAs = new String[Engine.STAGE][2];
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < qAndAs.length; i++) {
            int result = Utils.someNum();
            qAndAs[i][0] = String.valueOf(result);
            qAndAs[i][1] = isPrime(result) ? "yes" : "no";
        }
        Engine.braingamesEngine(qAndAs, question);
    }

    private static boolean isPrime(int n) {
        if (n == THREE) {
            return true;
        }
        if (n == 0 || n == 1 || n % (int) (Math.sqrt(n)) == 0) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
