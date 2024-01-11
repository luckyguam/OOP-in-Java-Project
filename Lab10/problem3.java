
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x=0;

        System.out.print("Enter the number of die rolls: ");
        if (x >= 0) {
            x = scan.nextInt();

            if (x > 0) {
                int count = 0;

                for (int roll = 1; roll <= x; roll++) {
                    int dieRoll = (int) (Math.random() * 6) + 1;
                    System.out.println("Roll " + roll + ": " + dieRoll);

                    if (dieRoll == 1) {
                        count++;
                    }
                }

                System.out.println("Total number of ones rolled: " + count + ".");
            } else {
                System.out.println("Not playing games.");
            }
        } else {
            System.out.println("Not playing games.");
        }
        scan.close();
    }
}
