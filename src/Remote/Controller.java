package Remote;

import ElectronicDevice.ElectronicDevice;

public class Controller extends Remote {

    private int x, y, radius;

    public Controller(ElectronicDevice electronicDevice) {
        super(electronicDevice);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public void turnOn() {
        device.turnOn();
    }
}
