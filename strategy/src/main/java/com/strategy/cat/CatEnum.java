package com.strategy.cat;

public class CatEnum {
    SpeakEnum se = SpeakEnum.TALKING;

    public void setSe(SpeakEnum se) {
        this.se = se;
    }
    public void speak(){
        se.speak();
    }
}
