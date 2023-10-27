package org.example;

import org.example.Prototype.MyShape;
import org.example.factoryMetod.EllipseCreator;
import org.example.factoryMetod.RectangleCreator;
import org.example.factoryMetod.ShapeMaker;
import org.example.singleton.Model;

import java.awt.*;
import java.awt.geom.RectangularShape;

public class Main {
    public static void main(String[] args) {
        /**
         * factoryMetod
         */

        ShapeMaker shapeMaker = new EllipseCreator();
        RectangularShape rectangularShape = shapeMaker.createShape();
        shapeMaker = new RectangleCreator();
        rectangularShape = shapeMaker.createShape();
        /**
         * singleton
         */
        Model model= Model.getInstance();
        /**
         * Prototype
         */
        MyShape shape = new MyShape(Color.white);
        MyShape shape1 = shape.clone();
        System.out.println(shape1.getColor());
    }
}