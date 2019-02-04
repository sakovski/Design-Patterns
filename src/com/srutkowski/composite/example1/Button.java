package com.srutkowski.composite.example1;

public class Button implements MenuComponent {

    private String value;

    public Button(String value) {
        this.value = value;
    }

    @Override
    public void printContent() {
        System.out.println("Button: ".concat(value));
    }
}
