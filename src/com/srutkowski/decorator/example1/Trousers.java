package com.srutkowski.decorator.example1;

public class Trousers extends Clothing {

    protected Trousers(Human wrappee) {
        super(wrappee);
    }

    @Override
    public String getClothingDescription() {
        return getWrappee().getClothingDescription().concat(", Trousers");
    }
}
