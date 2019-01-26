package com.srutkowski.factorymethod.example1;

public class TestUsage {

    public static void main(String... args) {
        var burgerTruck = new BurgerFoodTruck();
        var cheeseBurger = burgerTruck.orderFood("CheeseBurger");

        var saladTruck = new SaladFoodTruck();
        var greekSalad = saladTruck.orderFood("Greek Salad");

        printSummary(cheeseBurger);
        printSummary(greekSalad);
    }

    private static void printSummary(Food food) {
        System.out.println("Ordered: ". concat(food.getName()).concat(" for ").concat(food.getPrice().toString()));
    }
}
