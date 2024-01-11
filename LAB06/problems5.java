// import java.util.Scanner;

// public class problems5 {
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         int x = 0;
//         System.out.print("Enter a positive integer: ");
//         int y;
//         int sum = 0;
//         while (true){
//             x = scan.nextInt();
//             if (x < 0){
//                 System.out.print("Invalid input! Try again: ");
//             }
//             else {
//                 while(true){
//                     y = x%10;
//                     if (y % 2 != 0) {
//                         sum += y;
//                     }
//                     x /= 10;
//                     if (x <=0 ){
//                         break;
//                     }
//                 }
//                 break;
//             }
//         }
//         System.out.println("The sum of the odd digits in the number is " + sum);
//     }
// }
