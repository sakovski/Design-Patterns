package com.srutkowski.adapter.pattern;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        System.out.println("Adapter method");
        adaptee.doAnything();
    }
}
