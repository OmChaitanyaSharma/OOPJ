/*
Lab 6 - Course Contents: - Exception handling in Java
- User defined exception in Java

List of Programs :
1. Aim of the program - Write a Java program to generate an
ArrayIndexOutofBoundsException and handle it using catch statement.
Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4
*/


package lab6;

import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        try {
            System.out.println("Enter the numbers:");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
        finally {
            System.out.println("this block anyways runs everytime");
        }

        sc.close();
    }
}
