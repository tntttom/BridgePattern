package Shape;

import Color.Color;
import Shape.Shape;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public void draw() {
        color.drawCircle(radius, x, y);
    }
}
