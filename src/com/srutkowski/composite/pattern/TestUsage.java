package com.srutkowski.composite.pattern;

public class TestUsage {

    public static void main(String... args) {
        var leaf1 = new Leaf(1);
        var leaf2 = new Leaf(2);
        var leaf3 = new Leaf(3);
        var leaf4 = new Leaf(4);
        var leaf5 = new Leaf(5);
        var leaf6 = new Leaf(6);

        var composite1 = new Composite(1);
        var composite2 = new Composite(2);
        var composite3 = new Composite(3);
        composite2.addChild(leaf1);
        composite2.addChild(leaf2);
        composite3.addChild(leaf3);
        composite3.addChild(leaf4);
        composite1.addChild(composite2);
        composite1.addChild(composite3);
        composite1.addChild(leaf5);
        composite1.addChild(leaf6);

        var client = new Client(composite1);
        client.doWork();
    }
}
