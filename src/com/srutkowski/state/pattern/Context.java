package com.srutkowski.state.pattern;

public class Context {

    private State currentState;
    private String someVariable;

    public Context() {
        this.currentState = new ConcreteStateA(this);
        this.someVariable = "Untouched";
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }

    public void doThat() {
        currentState.doThat();
        System.out.println(someVariable);
    }

    public void doThis() {
        currentState.doThis();
        System.out.println(someVariable);
    }
}
