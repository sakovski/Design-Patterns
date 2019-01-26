package com.srutkowski.factorymethod.pattern;

public abstract class Creator {

    public void method() {
        System.out.println("Something before creating product");
        var product = createProduct();
        product.doAnything();
    }

    protected abstract Product createProduct();

}
