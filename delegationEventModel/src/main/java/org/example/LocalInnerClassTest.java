package org.example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LocalInnerClassTest
{
    public static void main(String[] args)
    {
        TalkingClock1 clock = new TalkingClock1();
        clock.start(1000, true);

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 A clock that prints the time in regular intervals.
 */
class TalkingClock1
{
    /**
     Starts the clock.
     @param interval the interval between messages (in milliseconds)
     @param beep true if the clock should beep
     */
    public void start(int interval, final boolean beep)
    {
        class TimePrinter implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    private int interval;
    private boolean beep;
}
