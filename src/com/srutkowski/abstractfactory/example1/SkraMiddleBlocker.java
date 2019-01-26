package com.srutkowski.abstractfactory.example1;

public class SkraMiddleBlocker extends MiddleBlocker {

    protected SkraMiddleBlocker(String name, String surname) {
        super(name, surname);
    }

    @Override
    void blockBall() {
        System.out.println("Always stick to the opponent's middle blocker");
    }
}
