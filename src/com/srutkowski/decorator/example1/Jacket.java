package com.srutkowski.decorator.example1;

public class Jacket extends Clothing{

    protected Jacket(Human wrappee) {
        super(wrappee);
    }

    @Override
    public String getClothingDescription() {
        return getWrappee().getClothingDescription().concat(", Jacket");
    }
}
