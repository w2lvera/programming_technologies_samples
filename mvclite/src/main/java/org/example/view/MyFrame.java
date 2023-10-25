package org.example.view;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame(MyPanel panel) {
        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
}
