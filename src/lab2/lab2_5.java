package lab2;

import java.util.Scanner;

public class lab2_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: Take first name and last name from user
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Output: Print last name followed by first name
        System.out.println(lastName + " " + firstName);

        sc.close();
    }
}
