package com.srutkowski.command.pattern;

import java.util.List;

public class Invoker {

    private List<Command> commands;
    private Command undoCommand;

    public Invoker(List<Command> commands) {
        this.commands = commands;
        undoCommand = commands.get(0);
    }

    public Invoker setCommands(List<Command> commands) {
        this.commands = commands;
        return this;
    }

    public Invoker addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void executeCommand(int index) {
        if(index < commands.size()) {
            var commandToBeExecuted = commands.get(index);
            commandToBeExecuted.execute();
            undoCommand = commandToBeExecuted;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void undo() {
        undoCommand.undo();
    }
}
