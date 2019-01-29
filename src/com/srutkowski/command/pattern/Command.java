package com.srutkowski.command.pattern;

public interface Command {

    void execute();
    void undo(); //Undo is optional
}
