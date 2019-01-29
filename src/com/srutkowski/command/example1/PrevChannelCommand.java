package com.srutkowski.command.example1;

public class PrevChannelCommand implements Command {

    private TV tv;

    public PrevChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.setCurrentChannel(tv.getChannels().get(tv.getCurrentChannel()-1));
    }

    @Override
    public void undo() {
        tv.setCurrentChannel(tv.getChannels().get(tv.getCurrentChannel()+1));
    }

    @Override
    public void setParameter(Integer parameter) {

    }
}
