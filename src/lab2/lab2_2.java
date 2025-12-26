package lab2;

public class lab2_2 {
    public static void main(String[] args) {

        int marks = 85; // You can change this value to test different marks

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: O");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: E");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: A");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");
        } else if (marks < 50 && marks >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
