/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softwaretechnologies.light.command.model;

import org.softwaretechnologies.light.command.model.grafModel.GrafModel;


/**
 *
 * @author vera
 */
public class Model {
    Light light;
    Blinds blinds;
    Command activeEntity;
    GrafModel gm;
    

    public Model(GrafModel gm) {
       blinds = new Blinds(); 
       light = new Light();
       activeEntity  = light;
       this.gm = gm;
       
    }
    public void execute(){
        activeEntity.execute();
        gm.execute();
       
        
    }
    public void unexecute(){
        activeEntity.unexecute();
        gm.unexecute();
      
    }

    public void setActiveEntityLight() {
        activeEntity = light;
        gm.setLableLight();
    }

    public void setActiveEntityBlind() {
        activeEntity = blinds;
        gm.setLableBlind();
    }
   
}
