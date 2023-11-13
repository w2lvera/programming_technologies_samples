package org.example.view;

import org.example.controller.Controller;
import org.example.controller.action.ActionDraw;
import org.example.controller.action.ActionMove;
import org.example.controller.state.State;
import org.example.model.FillBehavior;
import org.example.view.menu.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    MyPanel panel;
    State state;
    public MyFrame(MyPanel panel,State state) {
        /////////////////////////////// menu /////////////////////
        this.state = state;
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        ArrayList<Action> menuItems = new ArrayList<>();
//        menuItems.add(new SwitchEntity("открыть файл", new ImageIcon("rectangle.gif"),
//                new OpenFile(state)));
//        menuItems.add(new SwitchEntity("создать файл", new ImageIcon("rectangle.gif"),
//                new SaveFile(state)));
        menuItems.add(new SwitchState("прямоугольник", new ImageIcon("rectangle.gif"),
                new SwitchShape(new Rectangle2D.Double(),state)));
        menuItems.add(new SwitchState("овал", new ImageIcon("ellipse.gif"),
                new SwitchShape(new Ellipse2D.Double(),state)));
        menuItems.add(new SwitchState("незалитый", new ImageIcon("nofill.gif"),
                new SwitchFill(FillBehavior.NOFILL,state)));
        menuItems.add(new SwitchState("залитый", new ImageIcon("fill.gif"),
                new SwitchFill( FillBehavior.FILL,state)));
        menuItems.add(new SwitchState("рисовать", new ImageIcon("draw.gif"),
                new SwitchAction( new ActionDraw(),state)));
        menuItems.add(new SwitchState("двигать", new ImageIcon("move.gif"),
                new SwitchAction(new ActionMove(),state)));
//        menuItems.add(new SwitchUndo("undo", new ImageIcon("undo.gif"), undoMachine));
//        menuItems.add(new SwitchRedo("redo", new ImageIcon("redo.gif"), undoMachine));
        menuItems.add(new SwitchState("выбор цвета", new ImageIcon("colors.gif"),
                new SwitchColor(state)));

        ArrayList<JMenu> menus = new ArrayList<>();
        // menus.add(new JMenu("Файл"));
        menus.add(new JMenu("Фигура"));
        menus.add(new JMenu("Заливка"));
        menus.add(new JMenu("Действие"));
        // menus.add(new JMenu("Undo/redo"));
        menus.add(new JMenu("Цвет"));
        int i = 0;
        int k = menuItems.size()-2;
        for (JMenu m : menus) {
            menuBar.add(m);

            if (i < k) {
                m.add(menuItems.get(i));
                m.add(menuItems.get(i + 1));
                i += 2;
            } else {
                m.add(menuItems.get(i));
            }
        }
        JToolBar toolBar = new JToolBar();
        for (Action x : menuItems) {
            toolBar.add(x);
        }
        ((JButton)toolBar.getComponent(0)).setToolTipText("rectangle");
        ((JButton)toolBar.getComponent(1)).setToolTipText("ellipse");
        ((JButton)toolBar.getComponent(2)).setToolTipText("NOFILL");
        ((JButton)toolBar.getComponent(3)).setToolTipText("FILL");
        ((JButton)toolBar.getComponent(4)).setToolTipText("draw");
        ((JButton)toolBar.getComponent(5)).setToolTipText("move");
        ((JButton)toolBar.getComponent(6)).setToolTipText("color");
        add(toolBar, BorderLayout.NORTH);
//////////////////////////////////////////////// end menu /////////////////////////////


        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);

    }
}
