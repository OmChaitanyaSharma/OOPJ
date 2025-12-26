package lab2;

public class lab2_4 {
    public static void main(String[] args) {
        // Input: Mention the number here
        int num = 121; // You can change this number to test other values
        int originalNum = num;
        int reversedNum = 0;

        // Logic to reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        // Output: Check if the number is palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome.");
        }
    }
}
