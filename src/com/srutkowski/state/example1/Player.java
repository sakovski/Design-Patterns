package com.srutkowski.state.example1;

public class Player {

    private PlayerState playerState;
    private float movementSpeed = 0f;

    public Player() {
        this.playerState = new IdleState(this);
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public void hitOnRange() {
        System.out.println("Hitting opponent on range");
    }

    public void hitClose() {
        System.out.println("Hitting opponent close");
    }

    public void dropItem() {
        System.out.println("Dropping item");
    }

    public void craftItem() {
        System.out.println("Crafting item");
    }

    public void drinkMixture() {
        System.out.println("Drinking mixture");
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(float movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
}
