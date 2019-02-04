package com.srutkowski.composite.pattern;

public class Client {

    private Component component;

    public Client(Component component) {
        this.component = component;
    }

    public void doWork() {
        component.doSomeWork();
    }
}
