package com.srutkowski.iterator.example1;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class AddressBookNameAlphabeticalIterator implements Iterator {

    private AddressBook addressBook;
    private int currentElement;

    public AddressBookNameAlphabeticalIterator(AddressBook addressBook) {
        this.addressBook = addressBook;
        this.currentElement = 0;
    }

    @Override
    public Optional<Address> getNext() {
        if(hasNext()) {
            var sorted = addressBook.getAddresses().stream()
                    .sorted(Comparator.comparing(Address::getName))
                    .collect(Collectors.toList());
            return Optional.of(sorted.get(currentElement++));
        }
        return Optional.empty();
    }

    @Override
    public boolean hasNext() {
        return addressBook.getAddresses().size() > currentElement;
    }
}
