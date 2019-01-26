package com.srutkowski.factorymethod.pattern;

public class TestUsage {

    public static void main(String... args) {
        var creator1 = new ConcreteCreator1();
        creator1.method();

        var creator2 = new ConcreteCreator2();
        creator2.method();
    }
}
