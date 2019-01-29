package com.srutkowski.command.example1;

import java.util.Arrays;

public class TestUsage {

    public static void main(String... args) {
        var channels = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);
        var tv = new TV(channels);

        var nextChannelCommand = new NextChannelCommand(tv);
        var prevChannelCommand = new PrevChannelCommand(tv);
        var switchDirectChannelCommand = new SwitchDirectChannelCommand(tv);

        var remoteControl = new RemoteControl(nextChannelCommand, prevChannelCommand, switchDirectChannelCommand);

        printCurrentChannel(tv);

        remoteControl.pushNextChannel();
        printCurrentChannel(tv);

        remoteControl.pushNextChannel();
        remoteControl.pushNextChannel();
        printCurrentChannel(tv);

        remoteControl.pushDirectChannel(8);
        printCurrentChannel(tv);

        remoteControl.pushPrevChannel();
        printCurrentChannel(tv);
    }

    private static void printCurrentChannel(TV tv) {
        System.out.println("Current channel is: " + tv.getCurrentChannel());
    }
}
