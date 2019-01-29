package com.srutkowski.command.example1;

public interface Command {

    void execute();
    void undo();
    void setParameter(Integer parameter);
}
