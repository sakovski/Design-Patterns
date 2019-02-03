package com.srutkowski.iterator.pattern;

import java.util.List;

public class ConcreteCollection implements IterableCollection {

    private List<CollectionElement> collection;

    public ConcreteCollection(List<CollectionElement> collection) {
        this.collection = collection;
    }

    public List<CollectionElement> getCollection() {
        return collection;
    }

    public void setCollection(List<CollectionElement> collection) {
        this.collection = collection;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
