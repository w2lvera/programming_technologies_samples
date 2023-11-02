/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softwaretechnologies.light.command.view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import org.softwaretechnologies.light.command.controller.Controller;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author vera
 */
public class MyPanel extends JPanel implements Observer {

    Controller c;
    JLabel lightEntity;
    JLabel blindEntity;

    public MyPanel(Controller c) {
        this.c = c;
        JButton blind = new JButton("Blind");
        JButton light = new JButton("Light");
        JButton on = new JButton("on");
        JButton off = new JButton("off");
        blindEntity = new JLabel("on");
        lightEntity = new JLabel("off");
        blindEntity.setBackground(Color.BLACK);
        blindEntity.setHorizontalAlignment(JLabel.CENTER);
        blindEntity.setOpaque(true);
        lightEntity.setBackground(Color.YELLOW);
        lightEntity.setHorizontalAlignment(JLabel.CENTER);
        light.setEnabled(false);
        lightEntity.setOpaque(true);
        
        GridLayout myLayout = new GridLayout(0, 2);
        setLayout(myLayout);

        add(blind);
        add(blindEntity);
        add(light);
        add(lightEntity);
        add(on);
        add(off);

        blind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.changeEntityBlind();
                blind.setEnabled(false);
                light.setEnabled(true);
            }
        });
        light.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.changeEntityLight();
                blind.setEnabled(true);
                light.setEnabled(false);

            }
        });
        on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.execute();
            }
        });
        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.unexecute();
            }
        });

    }

    public JLabel getLightEntity() {
        return lightEntity;
    }

    public JLabel getBlindEntity() {
        return blindEntity;
    }

    public void setC(Controller c) {
        this.c = c;
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }

}
