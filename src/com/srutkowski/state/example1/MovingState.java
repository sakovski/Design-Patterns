package com.srutkowski.state.example1;

public class MovingState implements PlayerState {

    private Player player;

    public MovingState(Player player) {
        System.out.println("Players moving now");
        this.player = player;
        this.player.setMovementSpeed(2f);
    }

    @Override
    public void onA() {
        var newSpeed = player.getMovementSpeed() + 1f;
        System.out.println("Players speed is now " + newSpeed);
        player.setMovementSpeed(newSpeed);
    }

    @Override
    public void onB() {
        player.setPlayerState(new IdleState(player));
    }

    @Override
    public void onX() {
        player.setPlayerState(new AttackState(player));
    }

    @Override
    public void onY() {
        player.setPlayerState(new EquipmentState(player));
    }
}
