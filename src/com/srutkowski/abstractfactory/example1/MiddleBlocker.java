package com.srutkowski.abstractfactory.example1;

public abstract class MiddleBlocker extends Player {

    protected MiddleBlocker(String name, String surname) {
        super(name, surname);
    }

    abstract void blockBall();
}
