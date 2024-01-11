import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        System.out.print("What is the original price ? " );
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x >= 125){
            System.out.println("The reduced price is $" + (int)(x * 0.9));
        }
        else
        {
            System.out.println("That does not qualify for a discount. The price is $" + x + " .");
        }
        scan.close();
    }
}
