package com.srutkowski.adapter.pattern;

public class TestUsage {

    public static void main(String... args) {
        var originalTarget = new TargetImpl();
        var client = new Client(originalTarget);

        client.executeClientMethod();

        var adaptedTarget = new Adapter(new Adaptee());
        client.setTarget(adaptedTarget);
        client.executeClientMethod();
    }
}
