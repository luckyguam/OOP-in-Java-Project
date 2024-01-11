
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Enter an integer greater than or equal to 10: ");
        do{
            x = scan.nextInt();
            if (x< 10){
                System.out.print("Invalid input! Try again: ");
            }
        }while ( x < 10);
        int y = (int) (Math.random() * x ) + 1;
        System.out.println("random integer between 1 and " + x +" is " + y + ".");
    }
}
