package com.srutkowski.abstractfactory.example1;

public class SkraReceiver extends Receiver {

    protected SkraReceiver(String name, String surname) {
        super(name, surname);
    }

    @Override
    void receiveBall() {
        System.out.println("Always hand passing floats");
    }
}
