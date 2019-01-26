package com.srutkowski.abstractfactory.example1;

public abstract class Setter extends Player {

    protected Setter(String name, String surname) {
        super(name, surname);
    }

    abstract void setBall();
}
