/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Collection;
import java.util.stream.Collectors;

import model.Model;
import model.Point;
import model.Rectangle;
import model.Shape;
import view.MyFrame;
import view.MyPanel;

/**
 *
 * @author Wera
 */
public class Controller {

    Model model;
    MyPanel panel;

    java.awt.Shape forClone;

    public Controller() {
        model = new Model(new Rectangle(Point.ZERO, Point.ZERO));
        panel = new MyPanel(this);
        new MyFrame(panel);
    }

    public Point createPointFromGraphics(Point2D point2D){
        return new Point(point2D.getX(), point2D.getY());
    }

    public void createShape(Point p){
         model.createShape(p);
    }
    public void stretchShape(Point p){
         model.stretchShape(p);
    }

    public Collection<java.awt.Shape> translate(){
        return model.getShapes().stream().map(shape-> {
            Rectangle2D.Double rect = new Rectangle2D.Double();
            rect.setFrameFromDiagonal(shape.getPointOne().getX(),
                    shape.getPointOne().getY(),
                    shape.getPointTwo().getX(),
                    shape.getPointTwo().getY());
            return rect;
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new Controller();
    }
}
