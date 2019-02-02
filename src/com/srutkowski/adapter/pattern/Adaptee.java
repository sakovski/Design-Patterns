package com.srutkowski.adapter.pattern;

public class Adaptee implements Origin {

    @Override
    public void doAnything() {
        System.out.println("Adaptee method");
    }
}
