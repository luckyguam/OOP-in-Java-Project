
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = (int) (Math.random() * 100) + 1;
        int guess;
        int guesses = 0;

        System.out.println("Guess the integer I've picked from the range 1 to 100:");

        do {
            guess = scan.nextInt();
            guesses++;

            if (guess < n) {
                System.out.println("Too small.");
            } else if (guess > n) {
                System.out.println("Too big.");
            }
        } while (guess != n);

        System.out.println("Congratulations! You took " + guesses + " guesses.");
        scan.close();
    }
}
