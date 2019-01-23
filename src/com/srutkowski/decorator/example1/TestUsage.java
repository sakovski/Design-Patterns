package com.srutkowski.decorator.example1;

public class TestUsage {

    //Simulator of dressing people
    public static void main(String... args) {
        Human mark = new Mark();
        mark = new Jacket(mark);
        mark = new Trousers(mark);
        mark = new Jacket(mark);
        System.out.println("Mark's wearing: ".concat(mark.getClothingDescription()));

        Human john = new John();
        john = new PairOfShoes(john);
        john = new PairOfShoes(john);
        System.out.println("John's wearing: ".concat(john.getClothingDescription()));
    }
}
