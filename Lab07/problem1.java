package Lab07;




import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int x = scan.nextInt();
            if (x < 0){
                System.out.print("Bad input! Try again: ");
            }
            else if (x > 0) {
                while (x!= 0){
                    int y = x % 10;
                    if (y == 5){
                        System.out.println("The number contains the digit 5.");
                    }
                    x/=10;
                }
                if (y != 5){
                    System.out.println("The number does not contain the digit 5. ");
                }
            }
        }
    }
}
