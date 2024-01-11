
import java.util.Random;

public class problem5 {
    public static void main(String[] args) {
        int[] numTosses = {10, 100, 1000, 10000};

        for (int n : numTosses) {
            int h = 0;
            int t = 0; 
            for (int i = 0; i < n; i++) {
                int tossResult = Tosser();
                if (tossResult == 0) {
                    h++;
                } else {
                    t++;
                }
            }
            double hprob = (double) h / n;
            double tprob = (double) t / n;

            // Print results
            System.out.println("Probability of heads given " + n + " tosses = " + hprob);
            System.out.println("Probability of tails given " + n + " tosses = " + tprob);
        }
    }

    private static int Tosser() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
