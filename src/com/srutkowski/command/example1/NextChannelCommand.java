package com.srutkowski.command.example1;

public class NextChannelCommand implements Command {

    private TV tv;

    public NextChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.setCurrentChannel(tv.getChannels().get(tv.getCurrentChannel()+1));
    }

    @Override
    public void undo() {
        tv.setCurrentChannel(tv.getChannels().get(tv.getCurrentChannel()-1));
    }

    @Override
    public void setParameter(Integer parameter) {

    }
}
