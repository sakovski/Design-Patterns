package com.srutkowski.templatemethod.pattern;

public class TemplateMethodSubClass1 extends TemplateMethodBaseClass{

    @Override
    void step1() {
        System.out.println("Implemented behaviour for this class on step1.");
    }

    @Override
    void step3() {
        System.out.println("Implemented behaviour for this class on step3.");
    }
}
