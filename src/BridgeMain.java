import ElectronicDevice.*;
import Remote.*;

public class BridgeMain {

    public static void main(String[] args) {
        Remote fan = new Controller(new Fan());
        Remote television = new Controller(new Television());

        fan.turnOn();
        television.turnOn();


    }

}

