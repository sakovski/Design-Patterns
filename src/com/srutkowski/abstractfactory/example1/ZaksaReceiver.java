package com.srutkowski.abstractfactory.example1;

public class ZaksaReceiver extends Receiver {

    protected ZaksaReceiver(String name, String surname) {
        super(name, surname);
    }

    @Override
    void receiveBall() {
        System.out.println("Always leave floats to libero");
    }
}
