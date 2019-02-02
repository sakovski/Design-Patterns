package com.srutkowski.facade.pattern;

public class Facade {

    private ExampleClass2 exampleClass2;
    private ExampleClass3 exampleClass3;
    private ExampleClass4 exampleClass4;

    public Facade(ExampleClass2 exampleClass2, ExampleClass3 exampleClass3, ExampleClass4 exampleClass4) {
        this.exampleClass2 = exampleClass2;
        this.exampleClass3 = exampleClass3;
        this.exampleClass4 = exampleClass4;
    }

    public void executeFacadeMethod() {
        exampleClass2.executeSomething();
        exampleClass3.handleSomething();
        exampleClass4.changeSomething();
    }
}
