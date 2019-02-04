package com.srutkowski.composite.example1;

public class TestUsage {

    public static void main(String... args) {

        var dropDownNew = new DropDownMenu("New");
        dropDownNew.addComponent(new Button("Project"));
        dropDownNew.addComponent(new Button("Project from existing source"));
        dropDownNew.addComponent(new Button("Module"));

        var file = new DropDownMenu("File");
        file.addComponent(dropDownNew);
        file.addComponent(new Button("Open"));
        file.addComponent(new Button("Open Url"));
        file.addComponent(new Button("Open Recent"));
        file.addComponent(new Button("Close Project"));

        var edit = new DropDownMenu("Edit");
        edit.addComponent(new Button("Cut"));
        edit.addComponent(new Button("Copy"));
        edit.addComponent(new Button("Copy Path"));
        edit.addComponent(new Button("Copy Reference"));

        var menuBar = new DropDownMenu("MAIN MENU:");
        menuBar.addComponent(file);
        menuBar.addComponent(edit);

        var intelliJMenu = new Menu(menuBar);
        intelliJMenu.printMenu();
    }
}
