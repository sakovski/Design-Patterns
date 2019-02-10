package com.srutkowski.state.example1;

public class AttackState implements PlayerState {

    private Player player;

    public AttackState(Player player) {
        this.player = player;
        System.out.println("Player is attacking now");
    }

    @Override
    public void onA() {
        player.hitClose();
    }

    @Override
    public void onB() {
        player.hitOnRange();
    }

    @Override
    public void onX() {
        player.setPlayerState(new MovingState(player));
    }

    @Override
    public void onY() {
        player.setPlayerState(new IdleState(player));
    }
}
