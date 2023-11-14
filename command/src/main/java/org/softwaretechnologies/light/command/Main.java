package org.softwaretechnologies.light.command;

import org.softwaretechnologies.light.command.model.Blinds;
import org.softwaretechnologies.light.command.model.Command;
import org.softwaretechnologies.light.command.model.Light;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Blinds blinds = new Blinds();
        Command command; // кнопка переключения
        command = blinds;
        command.execute();
        System.out.println(blinds.isOn_off());
        command = light;
        command.execute();
        System.out.println(light.isOn_off());
    }
}