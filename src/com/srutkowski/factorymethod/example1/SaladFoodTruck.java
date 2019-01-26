package com.srutkowski.factorymethod.example1;

public class SaladFoodTruck extends FoodTruck {

    @Override
    protected Food createFood(String name) {
        return new Salad(14.25, true, name);
    }
}
