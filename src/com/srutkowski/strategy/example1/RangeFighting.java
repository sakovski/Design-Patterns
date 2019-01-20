package com.srutkowski.strategy.example1;

public class RangeFighting implements FightingStrategy {

    @Override
    public void attack(Integer strength) {
        System.out.println("Range attack with strength: ".concat(strength.toString()));
    }
}
