// This is an interface that defines a contract
interface RemoteControl {
    void turnOn();  // Method without body
    void turnOff(); // Method without body
}

// This class implements the interface
public class InterfaceExample implements RemoteControl {

    // Implementation of the turnOn method
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    // Implementation of the turnOff method
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public static void main(String[] args) {
        // Creating an object of the implementing class
        InterfaceExample tv = new InterfaceExample();

        // Using interface methods
        tv.turnOn();
        tv.turnOff();
    }
}
