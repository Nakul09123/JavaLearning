public class ClassExample {
    String brand;
    int speed;

    public ClassExample(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        speed = speed + 10;
        System.out.println("The car accelerated to " + speed + " km/h");
    }

    public static void main(String[] args) {
        ClassExample car1 = new ClassExample("Toyota", 50);

        System.out.println("Created a car with brand: " + car1.brand);
        System.out.println("Initial speed: " + car1.speed);

        car1.accelerate();
    }
}
