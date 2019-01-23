package com.srutkowski.decorator.pattern;

public class ConcreteDecorator extends BaseDecorator {

    public ConcreteDecorator(Component wrappee) {
        super(wrappee);
    }

    @Override
    void method2() {
        System.out.println("Behaviour of specific decorator");
        getWrappee().method2();
    }
}
