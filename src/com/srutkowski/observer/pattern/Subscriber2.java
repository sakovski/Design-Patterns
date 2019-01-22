package com.srutkowski.observer.pattern;

public class Subscriber2 implements Observer {

    @Override
    public void update() {
        System.out.println("Thank you, Observable, for notifying me!");
    }
}
