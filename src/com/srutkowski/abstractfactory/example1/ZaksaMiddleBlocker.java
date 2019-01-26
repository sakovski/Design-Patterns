package com.srutkowski.abstractfactory.example1;

public class ZaksaMiddleBlocker extends MiddleBlocker {

    protected ZaksaMiddleBlocker(String name, String surname) {
        super(name, surname);
    }

    @Override
    void blockBall() {
        System.out.println("Move always to 4");
    }
}
