package com.srutkowski.iterator.pattern;

import java.util.ArrayList;

public class TestUsage {

    public static void main(String... args) {
        var elements = new ArrayList<CollectionElement>();
        elements.add(new CollectionElement(1, "one"));
        elements.add(new CollectionElement(2, "two"));
        elements.add(new CollectionElement(3, "three"));
        elements.add(new CollectionElement(4, "four"));
        var collection = new ConcreteCollection(elements);

        var iterator = collection.createIterator();
        fetchAndPrintElement(iterator);
        fetchAndPrintElement(iterator);
        fetchAndPrintElement(iterator);
        fetchAndPrintElement(iterator);
        fetchAndPrintElement(iterator);
    }

    private static void fetchAndPrintElement(Iterator iterator) {
        if(iterator.hasNext()) {
            var element = iterator.getNext();
            System.out.println(String.format("Element fetched: id: %s, value: %s", element.getId(), element.getValue()));
        } else {
            System.out.println("Collection has no more next elements");
        }
    }
}
