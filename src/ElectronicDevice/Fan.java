package ElectronicDevice;

public class Fan implements ElectronicDevice {

    @Override
    public void turnOn() {
        System.out.println("Turning on fan with remote!");
    }
}
