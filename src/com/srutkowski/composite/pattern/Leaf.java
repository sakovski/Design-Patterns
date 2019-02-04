package com.srutkowski.composite.pattern;

public class Leaf implements Component {

    private int id;

    public Leaf(int id) {
        this.id = id;
    }

    @Override
    public void doSomeWork() {
        System.out.println(String.format("Leaf with id %s: I'm doing my work now.", this.id));
    }
}
