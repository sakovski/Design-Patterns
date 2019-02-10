package com.srutkowski.state.pattern;

public class ConcreteStateB implements State {

    private Context context;

    public ConcreteStateB(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        System.out.println("ConcreteStateB doThis()");
    }

    @Override
    public void doThat() {
        System.out.println("ConcreteStateB doThat()");
        context.setSomeVariable("ConcreteStateB has set this variable");
        context.setCurrentState(new ConcreteStateA(context));
    }
}
