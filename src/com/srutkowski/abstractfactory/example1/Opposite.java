package com.srutkowski.abstractfactory.example1;

public abstract class Opposite extends Player {

    protected Opposite(String name, String surname) {
        super(name, surname);
    }

    abstract void attackBall();
}
