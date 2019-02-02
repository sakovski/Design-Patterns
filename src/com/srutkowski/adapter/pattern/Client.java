package com.srutkowski.adapter.pattern;

public class Client {

    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void executeClientMethod() {
        target.doSomething();
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
