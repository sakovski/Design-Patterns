package com.srutkowski.command.pattern;

public class CommandB implements Command {

    private ReceiverB receiver;

    public CommandB(ReceiverB receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.executeSomething();
    }

    @Override
    public void undo() {
        System.out.println("CommandB undo method");
    }
}
