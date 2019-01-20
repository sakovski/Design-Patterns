package com.srutkowski.strategy.pattern;

public class UsageTest {

    public static void main(String... args) {
        var impl1 = new StrategyImpl1();
        var impl2 = new StrategyImpl2();
        var context = new StrategyContext("field1", "field2", impl1);
        context.executeStrategyBehaviour();

        context.setStrategyBehaviour(impl2);
        context.executeStrategyBehaviour();
    }
}
