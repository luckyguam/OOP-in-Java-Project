
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for n (odd integer): ");
        n = scan.nextInt();

        if (n % 2 == 1 && n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i > n/2 && j == n -(i+1) )||(i == j && j < n / 2)) {
                        System.out.print("+");
                    } else if (j == n / 2 && i == j) {
                        System.out.print("*");
                    } else if ((i < n/2 && j == n-(i+1)) ||(j > n / 2 && j == i )) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scan.close();
    }
}
