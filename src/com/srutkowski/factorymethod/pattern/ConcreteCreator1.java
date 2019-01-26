package com.srutkowski.factorymethod.pattern;

public class ConcreteCreator1 extends Creator {

    @Override
    protected Product createProduct() {
        return new ConcreteProduct1();
    }
}
