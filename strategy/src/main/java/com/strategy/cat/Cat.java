package com.strategy.cat;

public class Cat {

    SpeakBehavior speakBehavior;

    public Cat() {
        speakBehavior = new Speak();
    }

    public void speak() {
        speakBehavior.speak();
    }

    public void setSpeakBehavior(SpeakBehavior speakBehavior) {
        this.speakBehavior = speakBehavior;
    }

}
