package org.example.model;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class MyShape {
    Color color;
    RectangularShape shape;
    FillBehavior fillBehavior;

    public MyShape(Color color, RectangularShape shape) {
        this.color = color;
        this.shape = shape;
        this.fillBehavior = FillBehavior.NOFILL;
    }

    public MyShape() {
        color = Color.BLACK;
        shape = new Rectangle2D.Double();
        this.fillBehavior = FillBehavior.NOFILL;
    }
    public void setFrame(Point2D [] p){
        shape.setFrameFromDiagonal(p[0],p[1]);
    }
    public void draw(Graphics2D g){
        fillBehavior.draw(g,shape);
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public RectangularShape getShape() {
        return shape;
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }

    public FillBehavior getFillBehavior() {
        return fillBehavior;
    }

    public void setFillBehavior(FillBehavior fillBehavior) {
        this.fillBehavior = fillBehavior;
    }
}
