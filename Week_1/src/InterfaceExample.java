interface RemoteControl {
    void turnOn();
    void turnOff();
}

public class InterfaceExample implements RemoteControl {

    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public static void main(String[] args) {
        InterfaceExample tv = new InterfaceExample();

        tv.turnOn();
        tv.turnOff();
    }
}
