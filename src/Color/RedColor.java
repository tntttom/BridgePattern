package Color;

import Color.Color;

public class RedColor implements Color {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing red circle with radius: " + radius + ", x: " + x + ", y: " + y );
    }
}
