package com.srutkowski.decorator.example1;

public abstract class Clothing implements Human {

    private Human wrappee;

    protected Clothing(Human wrappee) {
        this.wrappee = wrappee;
    }

    public Human getWrappee() {
        return wrappee;
    }

    public abstract String getClothingDescription();
}
