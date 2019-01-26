package com.srutkowski.abstractfactory.pattern;

public class TestUsage {

    public static void main(String... args) {
        var factoryA = new ConcreteFactoryA();
        var factoryB = new ConcreteFactoryB();

        var client = new Client(factoryA);
        System.out.println(client.getProductsSet());

        client.setFactory(factoryB);
        System.out.println(client.getProductsSet());
    }
}
