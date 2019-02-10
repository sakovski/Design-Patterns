package com.srutkowski.state.pattern;

public class TestUsage {

    public static void main(String... args) {
        var client = new Client(new Context());

        client.getContext().doThat();
        client.getContext().doThis();
        client.getContext().doThis();
    }
}
