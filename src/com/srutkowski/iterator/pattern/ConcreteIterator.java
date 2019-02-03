package com.srutkowski.iterator.pattern;

public class ConcreteIterator implements Iterator {

    private ConcreteCollection collection;
    private int currentPosition;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
        this.currentPosition = 0;
    }

    @Override
    public CollectionElement getNext() {
        return collection.getCollection().get(currentPosition++);
    }

    @Override
    public boolean hasNext() {
        return collection.getCollection().size() > currentPosition;
    }
}
