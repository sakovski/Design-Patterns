package com.srutkowski.abstractfactory.example1;

public class ZaksaOpposite extends Opposite {

    protected ZaksaOpposite(String name, String surname) {
        super(name, surname);
    }

    @Override
    void attackBall() {
        System.out.println("Attack ball diagonally");
    }
}
