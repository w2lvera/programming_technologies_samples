package org.example.controller.action;

import org.example.model.Border;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.model.MyShapeDecorator;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class ActionDraw {
    MyShapeDecorator sampleShape;
    MyShapeDecorator shape;
    Point2D[] p;
    Model model;

    public ActionDraw() {
        p = new Point2D[2];
    }

    public ActionDraw(  Model model) {
        shape = new Border(new MyShape());
        this.p = new Point2D[2];
        this.model = model;
    }

    public void setSampleShape(MyShapeDecorator shape) {
        this.sampleShape = shape;
    }
    public void stretchShape(Point point){
        p[1] =(Point2D) point;
        shape.setFrame(p);
    }
    public void createShape(Point point){
        p[0] = (Point2D)point;
        shape = sampleShape.clone();
        shape.setParameter(20);
        model.createCurrentShape(shape);
    }


}
