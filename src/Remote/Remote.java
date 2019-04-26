package Remote;

import ElectronicDevice.ElectronicDevice;

public abstract class Remote {

    public ElectronicDevice device;

    public Remote(ElectronicDevice device) {

        this.device = device;
    }

    public abstract void turnOn();

}
