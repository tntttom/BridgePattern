package Color;

import Color.Color;

public class BlueColor implements Color {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing blue circle with radius: " + radius + ", x: " + x + ", y: " + y );
    }
}
