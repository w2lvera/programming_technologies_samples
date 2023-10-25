package org.example.controller;

//import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionDraw;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.RectangularShape;
import java.util.Collection;

public class Controller {
    //RectangularShape shape;
    Model model;
    MyPanel panel;
    MyFrame frame;
    ActionDraw actionDraw;

    public Controller() {
        model = new Model();
        model.setCurrentShape(new MyShape());
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        actionDraw = new ActionDraw(model);

    }

    public void mousePressed(Point point) {
        actionDraw.createShape(point);
    }

    public void mouseDragget(Point point) {
        actionDraw.stretchShape(point);
    }

    public void draw(Graphics2D g2) {
        model.getCurrentShape().draw(g2);
    }


}
