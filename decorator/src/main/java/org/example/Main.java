package org.example;

public class Main {
    public static void main(String[] args) {
       CarInterface car = new Coloring(new Reyling(new Car()));
       System.out.println("all cost = "+car.getCost()+"\n"+car.description());

    }
}