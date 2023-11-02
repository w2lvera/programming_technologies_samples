/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softwaretechnologies.light.command.controller;

import org.softwaretechnologies.light.command.model.Model;
import org.softwaretechnologies.light.command.model.grafModel.GrafModel;
import org.softwaretechnologies.light.command.view.MyFrame;
import org.softwaretechnologies.light.command.view.MyPanel;

/**
 *
 * @author vera
 */
public class Controller {

    MyFrame frame;
    MyPanel panel;
    Model model;
    GrafModel gm;

    public Controller() {

        panel = new MyPanel(this);
        gm = new GrafModel(panel.getLightEntity(),panel.getBlindEntity());
        gm.addObserver(panel);
        frame = new MyFrame(panel);
        model = new Model(gm);
       
    }

    

    public void changeEntityBlind() {
        model.setActiveEntityBlind();
    }

    public void changeEntityLight() {
        model.setActiveEntityLight();
    }

    public void execute() {
        model.execute();
    }
    public void unexecute() {
        model.unexecute();
    }

}
