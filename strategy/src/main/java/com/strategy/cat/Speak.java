package com.strategy.cat;

public class Speak implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.println("I can speak");
    }
}
