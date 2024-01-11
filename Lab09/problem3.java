
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        boolean z = true;
        System.out.print("Enter an integer between 1 and 20: ");
        while (z){
            x = scan.nextInt();
            if (x > 0 && x <= 20){
                z =false;
                System.out.println("The cube of your integer is " + (x*x*x) + ".");
            }
            else{
                System.out.print("Out of range. Enter an integer between 1 and 20: ");
            }
        }
        scan.close();
    }
}
