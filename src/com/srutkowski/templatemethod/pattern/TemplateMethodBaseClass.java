package com.srutkowski.templatemethod.pattern;

public abstract class TemplateMethodBaseClass {

    final void templateMethod() {
        step1();
        step2();
        step3();
        step4();
    }

    //Method which must be overriden in subclass
    abstract void step1();

    //Method not changeable - stable for all implementations
    final void step2() {
        System.out.println("Do something which cant be overriden");
    }

    abstract void step3();

    //Method with default implementation but able to be overriden in subclasses
    void step4() {
        System.out.println("Do something which can be changed but doesn't have to.");
    }
}
