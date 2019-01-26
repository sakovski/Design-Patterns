package com.srutkowski.factorymethod.example1;

public class BurgerFoodTruck extends FoodTruck {

    @Override
    protected Food createFood(String name) {
        return new Burger(20.13, false, name);
    }
}
