package com.srutkowski.factorymethod.example1;

public abstract class FoodTruck {

    public Food orderFood(String name) {
        System.out.println("Getting order");
        System.out.println("Accepting payment");
        System.out.println("Preparing...");
        var food = createFood(name);
        System.out.println(food.getName().concat(" ready to return"));
        return food;
    }

    protected abstract Food createFood(String name);
}
