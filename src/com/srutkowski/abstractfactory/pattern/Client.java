package com.srutkowski.abstractfactory.pattern;

public class Client {

    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public String getProductsSet() {
        var somethingFromProduct1 = factory.createProduct1().someMethod1();
        var somethingFromProduct2 = factory.createProduct2().someMethod2();
        var somethingFromProduct3 = factory.createProduct3().someMethod3();
        return String.format("Factory created: %s %s %s.", somethingFromProduct1, somethingFromProduct2, somethingFromProduct3);
    }
}
