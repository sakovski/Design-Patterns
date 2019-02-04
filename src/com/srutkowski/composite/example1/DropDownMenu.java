package com.srutkowski.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu implements MenuComponent {

    private String name;
    private List<MenuComponent> subComponents = new ArrayList<>();

    public DropDownMenu(String name) {
        this.name = name;
    }

    @Override
    public void printContent() {
        System.out.println(name);
        subComponents.forEach(MenuComponent::printContent);
        System.out.println("========");
    }

    public void addComponent(MenuComponent component) {
        subComponents.add(component);
    }

    public List<MenuComponent> getSubComponents() {
        return subComponents;
    }

    public void setSubComponents(List<MenuComponent> subComponents) {
        this.subComponents = subComponents;
    }
}
