package com.srutkowski.strategy.example1;

public class UsageTest {

    public static void main(String... args) {
        var hero = new Hero();
        var closeCombatFighting = new CloseCombatFighting();
        var rangeFighting = new RangeFighting();
        hero.setHealth(20).setStrength(50);

        hero.setFightingStrategy(rangeFighting);
        hero.attack();

        hero.setFightingStrategy(closeCombatFighting);
        hero.attack();
    }
}
