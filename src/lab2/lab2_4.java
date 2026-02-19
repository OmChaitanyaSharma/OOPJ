package lab3;
import java.util.Scanner;

class Plastic2D {
    double length, breadth;
    double cost2D;

    void input2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length (ft): ");
        length = sc.nextDouble();
        System.out.print("Enter breadth (ft): ");
        breadth = sc.nextDouble();
    }

    void calculate2D() {
        cost2D = length * breadth * 40;
    }

    void display2D() {
        System.out.println("Cost of 2D plastic sheet: Rs " + cost2D);
    }
}

class Plastic3D extends Plastic2D {
    double height;
    double cost3D;

    void input3D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height (ft): ");
        height = sc.nextDouble();
    }

    void calculate3D() {
        cost3D = length * breadth * height * 60;
    }

    void display3D() {
        System.out.println("Cost of 3D plastic box: Rs " + cost3D);
    }
}

public class lab2_4 {
    public static void main(String[] args) {
        Plastic3D obj = new Plastic3D();
        obj.input2D();
        obj.input3D();
        obj.calculate2D();
        obj.calculate3D();
        obj.display2D();
        obj.display3D();
    }
}
