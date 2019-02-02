package com.srutkowski.facade.pattern;

public class TestUsage {

    public static void main(String... args) {
        var class1 = new ExampleClass1();
        var class2 = new ExampleClass2();
        var class3 = new ExampleClass3();
        var class4 = new ExampleClass4(class1);

        new Facade(class2, class3, class4).executeFacadeMethod();
    }
}
