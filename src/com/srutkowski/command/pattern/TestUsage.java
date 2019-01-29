package com.srutkowski.command.pattern;

import java.util.ArrayList;

public class TestUsage {

    //THIS METHOD IS OUR PATTERN'S CLIENT
    public static void main(String... args) {
        var receiverA = new ReceiverA();
        var commandA = new CommandA(receiverA, "ParameterValue");

        var receiverB = new ReceiverB();
        var commandB = new CommandB(receiverB);

        var commands = new ArrayList<Command>();
        commands.add(commandA);
        commands.add(commandB);
        var invoker = new Invoker(commands);

        invoker.executeCommand(0);
        invoker.undo();
        invoker.executeCommand(1);
        invoker.undo();
    }
}
