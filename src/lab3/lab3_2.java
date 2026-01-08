package lab3;
import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
}

class Box extends Plate {
    double height;

    Box() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thickness: ");
        thickness = sc.nextDouble();
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Thickness: " + thickness);
    }
}

public class lab3_2 {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox();
        wb.display();
    }
}

