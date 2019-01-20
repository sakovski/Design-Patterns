package com.srutkowski.strategy.example1;

public class Hero {

    private Integer health;
    private Integer strength;
    private FightingStrategy fightingStrategy;

    public Hero setHealth(Integer health) {
        this.health = health;
        return this;
    }

    public Hero setStrength(Integer strength) {
        this.strength = strength;
        return this;
    }

    public Hero setFightingStrategy(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
        return this;
    }

    public void attack() {
        fightingStrategy.attack(strength);
    }
}
