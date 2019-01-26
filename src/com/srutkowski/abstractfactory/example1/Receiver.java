package com.srutkowski.abstractfactory.example1;

public abstract class Receiver extends Player {

    protected Receiver(String name, String surname) {
        super(name, surname);
    }

    abstract void receiveBall();
}
