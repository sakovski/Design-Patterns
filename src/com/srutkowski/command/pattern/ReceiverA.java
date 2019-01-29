package com.srutkowski.command.pattern;

public class ReceiverA {

    public void executeBusinessLogic(String parameter) {
        System.out.println(String.format("Business logic with parameter %s of ReceiverA executed!", parameter));
    }
}
