package lab5;

import java.util.Scanner;

/* General package simulation */
class employee {
    protected int empid;
    private String ename;
    protected double basic;

    employee(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public double earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}

/* Marketing package simulation */
class sales extends employee {

    sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public void display() {
        double totalEarning = earnings() + tallowance();
        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarning);
    }
}

/* Driver class */
public class lab5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        sales s = new sales(id, name, basic);
        s.display();

        sc.close();
    }
}
