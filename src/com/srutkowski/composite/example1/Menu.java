package com.srutkowski.composite.example1;

public class Menu {

    private MenuComponent menuComponent;

    public Menu(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.printContent();
    }
}
