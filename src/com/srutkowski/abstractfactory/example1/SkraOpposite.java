package com.srutkowski.abstractfactory.example1;

public class SkraOpposite extends Opposite {

    protected SkraOpposite(String name, String surname) {
        super(name, surname);
    }

    @Override
    void attackBall() {
        System.out.println("Attack ball straight");
    }
}
