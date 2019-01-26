package com.srutkowski.abstractfactory.example1;

public class ZaksaLibero extends Libero {

    protected ZaksaLibero(String name, String surname) {
        super(name, surname);
    }

    @Override
    void defendBall() {
        System.out.println("Defend ball in the middle of the court");
    }
}
