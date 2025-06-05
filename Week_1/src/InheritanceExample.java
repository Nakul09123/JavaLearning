class Vehicle {
    int wheels = 4;

    public void start() {
        System.out.println("Vehicle has started");
    }
}

public class InheritanceExample extends Vehicle {
    String type = "Sedan";

    public void showDetails() {
        System.out.println("Car type: " + type);
        System.out.println("Number of wheels: " + wheels); // Inherited from Vehicle
    }

    public static void main(String[] args) {
        InheritanceExample myCar = new InheritanceExample();

        myCar.start();

        myCar.showDetails();
    }
}
