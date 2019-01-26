package com.srutkowski.factorymethod.pattern;

public class ConcreteCreator2 extends Creator {

    @Override
    protected Product createProduct() {
        return new ConcreteProduct2();
    }
}
