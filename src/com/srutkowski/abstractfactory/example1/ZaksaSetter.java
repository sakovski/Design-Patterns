package com.srutkowski.abstractfactory.example1;

public class ZaksaSetter extends Setter {

    protected ZaksaSetter(String name, String surname) {
        super(name, surname);
    }

    @Override
    void setBall() {
        System.out.println("Set ball to ZAKSA attacker");
    }
}
