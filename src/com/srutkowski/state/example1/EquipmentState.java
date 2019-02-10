package com.srutkowski.state.example1;

public class EquipmentState implements PlayerState {

    private Player player;

    public EquipmentState(Player player) {
        this.player = player;
        System.out.println("Player is looking at eq now");
    }

    @Override
    public void onA() {
        player.drinkMixture();
    }

    @Override
    public void onB() {
        player.dropItem();
    }

    @Override
    public void onX() {
        player.craftItem();
    }

    @Override
    public void onY() {
        player.setPlayerState(new IdleState(player));
    }
}
