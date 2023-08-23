/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;
import controller.Controller;
import model.Color;
import model.Point;


/**
 *
 * @author Wera
 */
public class MyPanel extends JPanel{

    private final Controller controller;
    
    public MyPanel(Controller controller){

        this.controller = controller;

        addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent arg0){
                 Point one = controller.createPointFromGraphics(arg0.getPoint());
                 controller.createShape(one);
             }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent arg0) {
                Point two = controller.createPointFromGraphics(arg0.getPoint());
                controller.stretchShape(two);
                repaint();
            }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(controller.translate());
    }
   
}
