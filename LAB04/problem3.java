import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
         System.out.print("What is the original price ? " );
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x <= 100){
            System.out.println("The item qualifies for a 20% discount. The item's discounted price is $" + (int)(x * 0.8) + ".");
        }
        else
        {
            System.out.println("The item qualifies for a 40% discount. The item’s discounted price is $" + (int)(x*0.6) +".");
        }
        scan.close();
    }
}
