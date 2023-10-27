package org.example;

public class Car implements CarInterface{
    Car(){}
    @Override
    public int getCost() {
        return 500000;
    }

    @Override
    public String description() {
        return "base complectation 500000";
    }


}
