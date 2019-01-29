package com.srutkowski.command.example1;

public class RemoteControl {

    private Command nextChannel;
    private Command prevChannel;
    private Command directChannel;
    private Command undoCommand;

    public RemoteControl(Command nextChannel, Command prevChannel, Command directChannel) {
        this.nextChannel = nextChannel;
        this.prevChannel = prevChannel;
        this.directChannel = directChannel;
        this.undoCommand = nextChannel;
    }

    public void pushNextChannel() {
        nextChannel.execute();
    }

    public void pushPrevChannel() {
        prevChannel.execute();
    }

    public void pushDirectChannel(Integer channelNumber) {
        directChannel.setParameter(channelNumber);
        directChannel.execute();
    }

    public void undo() {
        undoCommand.undo();
    }
}
