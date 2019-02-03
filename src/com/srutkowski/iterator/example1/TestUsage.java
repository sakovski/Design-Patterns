package com.srutkowski.iterator.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TestUsage {

    public static void main(String... args) {
        var addresses = createListOfAddresses();
        var addressBook = new AddressBook(addresses);

        System.out.println("Sorted by name:");
        var nameAlphabeticalIterator = addressBook.createNameAlphabeticalIterator();
        IntStream.range(0, 7).forEach(index -> printNext(nameAlphabeticalIterator));

        System.out.println("\nSorted by surname:");
        var surnameAlphabeticalIterator = addressBook.createSurnameAlphabeticalIterator();
        IntStream.range(0, 7).forEach(index -> printNext(surnameAlphabeticalIterator));
    }

    private static List<Address> createListOfAddresses() {
        var addresses = new ArrayList<Address>();
        addresses.add(new Address("Harold", "Smith", "aaa"));
        addresses.add(new Address("Arnold", "Perry", "bbb"));
        addresses.add(new Address("Zygmunt", "Szczepaniak", "ccc"));
        addresses.add(new Address("Paul", "Roys", "ddd"));
        addresses.add(new Address("Celine", "Dion", "eee"));
        addresses.add(new Address("Justin", "Bieber", "fff"));
        return addresses;
    }

    private static void printNext(Iterator iterator) {
        iterator.getNext().ifPresentOrElse(address -> System.out.println(address.toString()), printError());
    }

    private static Runnable printError() {
        return () -> System.out.println("Collection has no more elements!");
    }
}
