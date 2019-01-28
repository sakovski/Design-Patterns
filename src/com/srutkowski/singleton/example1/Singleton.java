package com.srutkowski.singleton.example1;

public class Singleton {

    //Eagerly created instance to be thread safe but this approach might not be the best for performance
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
