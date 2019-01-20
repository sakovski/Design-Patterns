package com.srutkowski.strategy.example1;

public class CloseCombatFighting implements FightingStrategy {

    @Override
    public void attack(Integer strength) {
        System.out.println("Close combat attack with strength: ".concat(strength.toString()));
    }
}
