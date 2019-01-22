package com.srutkowski.observer.pattern;

public class Subscriber1 implements Observer {

    @Override
    public void update() {
        System.out.println("Observable/publisher told me to update myself :)");
    }
}
