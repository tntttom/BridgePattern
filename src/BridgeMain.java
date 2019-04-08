import Color.*;
import Shape.*;

public class BridgeMain {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10, new RedColor());
        Shape blueCircle = new Circle(100, 100, 10, new BlueColor());

        redCircle.draw();
        blueCircle.draw();


    }

}

