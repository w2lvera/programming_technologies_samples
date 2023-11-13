/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.view.menu;;
import org.example.controller.state.State;;
import java.awt.geom.RectangularShape;

/**
 *
 * @author vera
 */
public class SwitchShape implements Command{
    RectangularShape rs;
    State state;

    public SwitchShape(RectangularShape rs, State s) {
        this.rs = rs;
        state = s;
    }
    
    @Override
    public void execute() {
        state.setRectangularShape(rs);
    }
    
}
