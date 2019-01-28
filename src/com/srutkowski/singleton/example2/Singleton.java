package com.srutkowski.singleton.example2;

public class Singleton {

    //When performance matters, this approach is better than introduced in example1
    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
