package com.srutkowski.abstractfactory.example1;

public class SkraSetter extends Setter {

    protected SkraSetter(String name, String surname) {
        super(name, surname);
    }

    @Override
    void setBall() {
        System.out.println("Set ball to SKRA attacker");
    }
}
