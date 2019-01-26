package com.srutkowski.factorymethod.example1;

public abstract class Food {

    private Double price;
    private Boolean isVege;
    private String name;

    protected Food(Double price, Boolean isVeg, String name) {
        this.price = price;
        this.isVege = isVege;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public Food setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Boolean isVege() {
        return isVege;
    }

    public Food setVege(Boolean isVege) {
        isVege = isVege;
        return this;
    }

    public String getName() {
        return name;
    }

    public Food setName(String name) {
        this.name = name;
        return this;
    }
}
