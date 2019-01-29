package com.srutkowski.command.example1;

public class SwitchDirectChannelCommand implements Command {

    private Integer parameter;
    private TV tv;
    private Integer prevChannel;

    public SwitchDirectChannelCommand(TV tv) {
        this.parameter = 0;
        this.tv = tv;
    }

    @Override
    public void execute() {
        prevChannel = tv.getCurrentChannel();
        tv.setCurrentChannel(tv.getChannels().get(parameter));
    }

    @Override
    public void undo() {
        tv.setCurrentChannel(prevChannel);
    }

    @Override
    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }
}
