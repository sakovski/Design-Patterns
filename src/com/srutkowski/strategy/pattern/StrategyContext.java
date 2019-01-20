package com.srutkowski.strategy.pattern;

//Just client who uses strategy objects
public class StrategyContext {

    private String field1;
    private String field2;
    private Strategy strategyBehaviour;

    public StrategyContext(String field1, String field2, Strategy strategyBehaviour) {
        this.field1 = field1;
        this.field2 = field2;
        this.strategyBehaviour = strategyBehaviour;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setStrategyBehaviour(Strategy strategyBehaviour) {
        this.strategyBehaviour = strategyBehaviour;
    }

    //Context doesnt know which implementation will be executed
    public void executeStrategyBehaviour() {
        strategyBehaviour.executeStrategyMethod();
    }
}
