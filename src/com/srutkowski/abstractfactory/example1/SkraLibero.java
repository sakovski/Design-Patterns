package com.srutkowski.abstractfactory.example1;

public class SkraLibero extends Libero {

    protected SkraLibero(String name, String surname) {
        super(name, surname);
    }

    @Override
    void defendBall() {
        System.out.println("Defend ball close to line");
    }
}
