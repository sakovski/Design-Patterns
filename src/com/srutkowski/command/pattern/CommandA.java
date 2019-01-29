package com.srutkowski.command.pattern;

public class CommandA implements Command {

    private ReceiverA receiver;
    private String parameter;

    public CommandA(ReceiverA receiver, String parameter) {
        this.receiver = receiver;
        this.parameter = parameter;
    }

    @Override
    public void execute() {
        receiver.executeBusinessLogic(parameter);
    }

    @Override
    public void undo() {
        System.out.println("CommandA undo method");
    }
}
