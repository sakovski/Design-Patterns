package com.srutkowski.state.pattern;

public class ConcreteStateA implements State {

    private Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        System.out.println("ConcreteStateA doThis()");
        context.setSomeVariable("ConcreteStateA has set this variable");
        context.setCurrentState(new ConcreteStateB(context));
    }

    @Override
    public void doThat() {
        System.out.println("ConcreteStateA doThat()");
    }
}
