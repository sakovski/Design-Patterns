package com.srutkowski.decorator.pattern;

public abstract class Component {

    protected String field1 = "mocked";

    public String getField1() {
        return field1;
    }

    abstract void method2();
}
