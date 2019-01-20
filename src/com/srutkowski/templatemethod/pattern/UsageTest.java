package com.srutkowski.templatemethod.pattern;

public class UsageTest {

    public static void main(String... args) {
        var subClass1 = new TemplateMethodSubClass1();
        var subClass2 = new TemplateMethodSubClass2();

        subClass1.templateMethod();
        subClass2.templateMethod();
    }
}
