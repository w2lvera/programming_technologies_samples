package org.example.model;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public interface MyShapeDecorator {

    void draw(Graphics2D g2);

    void setFrame(Point2D[]p);

    RectangularShape getShape();

    void setParameter(int par);
    MyShapeDecorator clone();
    Color getColor();



}
