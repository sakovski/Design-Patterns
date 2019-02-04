package com.srutkowski.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> children = new ArrayList<>();
    private int id;

    public Composite(int id) {
        this.id = id;
    }

    @Override
    public void doSomeWork() {
        System.out.println(String.format("Composite with id %s: I delegate my work to my children: ", this.id));
        children.forEach(Component::doSomeWork);
        System.out.println(String.format("Composite with id %s: My children finished their work. ", this.id));
    }

    public void addChild(Component component) {
        children.add(component);
    }

    public void removeChild(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }
}
