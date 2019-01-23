package com.srutkowski.decorator.example1;

public class PairOfShoes extends Clothing {

    protected PairOfShoes(Human wrappee) {
        super(wrappee);
    }

    @Override
    public String getClothingDescription() {
        return getWrappee().getClothingDescription().concat(", Pair of shoes");
    }
}
