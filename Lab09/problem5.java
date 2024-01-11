
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter an odd integer from 5 to 25: ");
            x = scan.nextInt();
            if (x < 5 || x > 25 || x % 2 == 0) {
                System.out.print("Invalid input! ");
            }
        } while (x < 5 || x > 25 || x % 2 == 0);

        int n = (x + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int z = (2 * i - 1) * (2 * j - 1);
                System.out.print(z + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
