package com.srutkowski.abstractfactory.example1;

public abstract class Libero extends Player {

    protected Libero(String name, String surname) {
        super(name, surname);
    }

    abstract void defendBall();
}
