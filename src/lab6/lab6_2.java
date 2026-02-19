/*2. Aim of the program- Write a Java program to handle an ArithmeticException using try,
catch, and finally block.
Input: Operand values for division operation mentioned in the program
Output: ArithmeticException caught by try-catch-finally block

*/
package lab6;
import java.util.Scanner;
public class lab6_2 {
    public static void main(String args[]){
 Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
        int a =scanner.nextInt();

        System.out.println("enter the second number");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("result :" + result);
        }
        catch(ArithmeticException e ){
            System.out.println("artithemacticexception caught by the  block is ");
        }
            finally{
            System.out.println("this block gets executed everytime ");
        }

        }

    }
