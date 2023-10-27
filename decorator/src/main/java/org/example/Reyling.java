package org.example;

public class Reyling implements CarInterface{
    CarInterface carInterface;

    public Reyling(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public int getCost() {
        return carInterface.getCost()+7000;
    }

    @Override
    public String description() {
        return carInterface.description()+" +  reyling";
    }
}

