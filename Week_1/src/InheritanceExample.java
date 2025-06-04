// This is the base class or parent class
class Vehicle {
    int wheels = 4;

    // Method of the parent class
    public void start() {
        System.out.println("Vehicle has started");
    }
}

// This is the derived class or child class
public class InheritanceExample extends Vehicle {
    String type = "Sedan";

    // Method to display the car details
    public void showDetails() {
        System.out.println("Car type: " + type);
        System.out.println("Number of wheels: " + wheels); // Inherited from Vehicle
    }

    public static void main(String[] args) {
        // Creating an object of the child class
        InheritanceExample myCar = new InheritanceExample();

        // Calling a method from the parent class
        myCar.start();

        // Calling a method from the child class
        myCar.showDetails();
    }
}
