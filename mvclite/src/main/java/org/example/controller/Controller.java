package org.example.controller;

//import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionInterface;
import org.example.controller.state.State;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import java.util.Collection;

public class Controller {
    //RectangularShape shape;
    Model model;
    MyPanel panel;
    MyFrame frame;
    State state;


    public Controller() {
        model = new Model();
        state = new State(model);
        panel = new MyPanel(this);
        frame = new MyFrame(panel,state);

    }



    public void mousePressed(Point point) {
        state.getAction().mousePressed(point);
    }

    public void mouseDragget(Point point) {
        state.getAction().mouseDragget(point);
    }

    public Collection<MyShape> translate() {
        return model.getList();
    }


}
