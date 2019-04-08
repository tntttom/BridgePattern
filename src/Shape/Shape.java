package Shape;

import Color.Color;

public abstract class Shape {

    public Color color;

    public Shape(Color color) {

        this.color = color;
    }

    public abstract void draw();

}
