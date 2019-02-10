package com.srutkowski.state.example1;

public class IdleState implements PlayerState {

    private Player player;

    public IdleState(Player player) {
        this.player = player;
        this.player.setMovementSpeed(0f);
        System.out.println("Player is staying idle now");
    }

    @Override
    public void onA() {
        player.setPlayerState(new MovingState(player));
    }

    @Override
    public void onB() {
        player.setPlayerState(new EquipmentState(player));
    }

    @Override
    public void onX() {
        player.setPlayerState(new AttackState(player));
    }

    @Override
    public void onY() {

    }
}
