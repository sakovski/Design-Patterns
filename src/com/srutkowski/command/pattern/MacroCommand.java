package com.srutkowski.command.pattern;

import java.util.Collections;
import java.util.List;

//Macro command is a special command type that encapsulates family of commands to be executed at one time
public class MacroCommand implements Command {

    List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        //Not sure if this is one of the best practises but definitely funny one :)
        Collections.reverse(commands);
        execute();
        Collections.reverse(commands);
    }
}
