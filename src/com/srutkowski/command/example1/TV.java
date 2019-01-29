package com.srutkowski.command.example1;

import java.util.List;

public class TV {

    private List<Integer> channels;
    private Integer currentChannel;

    public TV(List<Integer> channels) {
        this.channels = channels;
        this.currentChannel = 0;
    }

    public List<Integer> getChannels() {
        return channels;
    }

    public void setChannels(List<Integer> channels) {
        this.channels = channels;
    }

    public void setCurrentChannel(Integer channel) {
        this.currentChannel = channels.get(channel);
    }

    public Integer getCurrentChannel() {
        return currentChannel;
    }
}
