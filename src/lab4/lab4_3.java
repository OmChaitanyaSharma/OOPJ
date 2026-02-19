package lab4;

interface Motor {
    int capacity = 5;

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
    }

    public void consume() {
    }

    void displayCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}

public class lab4_3 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();
        wm.displayCapacity();
    }
}
