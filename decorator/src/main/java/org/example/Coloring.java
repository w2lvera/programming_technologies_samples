package org.example;

public class Coloring implements CarInterface{
    CarInterface carInterface;

    public Coloring(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public int getCost() {
        return carInterface.getCost()+10000;
    }

    @Override
    public String description() {
        return carInterface.description() +" +  coloring";
    }
}
