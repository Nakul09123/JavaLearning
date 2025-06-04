// This class represents a simple Car object
public class ClassExample {
    // Instance variables or properties of the class
    String brand;
    int speed;

    // Constructor to initialize the object
    public ClassExample(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method that simulates accelerating the car
    public void accelerate() {
        speed = speed + 10;
        System.out.println("The car accelerated to " + speed + " km/h");
    }

    public static void main(String[] args) {
        // Creating an object of the ClassExample
        ClassExample car1 = new ClassExample("Toyota", 50);

        // Printing object details
        System.out.println("Created a car with brand: " + car1.brand);
        System.out.println("Initial speed: " + car1.speed);

        // Calling the accelerate method
        car1.accelerate();
    }
}
