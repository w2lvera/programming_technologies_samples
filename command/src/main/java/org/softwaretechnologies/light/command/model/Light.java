/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softwaretechnologies.light.command.model;

/**
 *
 * @author vera
 */
public class Light  implements Command{
    boolean on_off=true;
    @Override
    public void execute() {
        on_off = true;
        
    }

    @Override
    public void unexecute() {
        on_off = false;
        
    }

    public boolean isOn_off() {
        return on_off;
    }
    
}
