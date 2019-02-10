package com.srutkowski.state.example1;

public class XboxController {

    private Player player;

    public XboxController(Player player) {
        this.player = player;
    }

    public void pressA() {
        player.getPlayerState().onA();
    }

    public void pressB() {
        player.getPlayerState().onB();
    }

    public void pressX() {
        player.getPlayerState().onX();
    }

    public void pressY() {
        player.getPlayerState().onY();
    }
}
