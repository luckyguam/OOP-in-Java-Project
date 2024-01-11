
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x=0;
        int  y=0;
        System.out.print("Enter two positive integers with a difference of at least 10: ");
        do {
            x = scan.nextInt();
            y = scan.nextInt();
            if (x <= 0 || y <= 0 || Math.abs(x - y) < 10) {
                System.out.print("Invalid input! Try again:");
            }
        } while (x <= 0 || y <= 0 || Math.abs(x - y) < 10);

        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Random integer between " + min + " and " + max + " is " + randomValue + ".");
        scan.close();
    }
}
