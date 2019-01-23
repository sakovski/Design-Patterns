package com.srutkowski.decorator.pattern;

public class ConcreteComponent extends Component {

    @Override
    public void method2() {
        System.out.println("Overriden method to present some behaviour");
    }
}
