package lab2;

public class lab2_3 {
    public static void main(String[] args) {
        // Input: Mention the day number here
        int dayNo = 5; // You can change this value to test different days

        // Output: Display the corresponding weekday
        switch(dayNo % 7) { // Assuming day 1 is Sunday
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 0:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }
}
