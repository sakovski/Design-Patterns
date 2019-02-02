package com.srutkowski.facade.pattern;

public class ExampleClass4 {

    private ExampleClass1 exampleClass1;

    public ExampleClass4(ExampleClass1 exampleClass1) {
        this.exampleClass1 = exampleClass1;
    }

    public void changeSomething() {
        System.out.println("ExampleClass4 changes something using ExampleClass1");
        exampleClass1.doSomething();
    }
}
