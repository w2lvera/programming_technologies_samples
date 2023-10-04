package org.example.shape;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shapes {
    protected Point2D x;
    protected Point2D y;

    public Shapes(Point2D x, Point2D y) {
        this.x = x;
        this.y = y;
    }

    public Shapes() {
    }
    abstract public void draw(Graphics2D g);

    public abstract String getType();
}
