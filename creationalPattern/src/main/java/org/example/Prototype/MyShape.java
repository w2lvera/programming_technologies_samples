package org.example.Prototype;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    Color color;
    RectangularShape shape;

    public Color getColor() {
        return color;
    }

    public MyShape(Color color) {
        shape = new Ellipse2D.Double();
        this.color = color;
    }
    public MyShape clone(){
        MyShape s = new MyShape(color);
        s.shape = (RectangularShape) shape.clone();
        return s;
    }
}
