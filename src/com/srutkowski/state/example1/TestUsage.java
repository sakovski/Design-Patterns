package com.srutkowski.state.example1;

public class TestUsage {

    public static void main(String... args) {
        var player = new Player();
        var controller = new XboxController(player);

        controller.pressA();
        controller.pressX();
        controller.pressA();
        controller.pressB();

        controller.pressX();
        controller.pressA();
        controller.pressA();

        controller.pressY();
        controller.pressA();
        controller.pressB();
        controller.pressX();
    }
}
