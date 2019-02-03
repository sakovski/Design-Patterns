package com.srutkowski.iterator.example1;

import java.util.List;

public class AddressBook implements IterableCollection {

    private List<Address> addresses;

    public AddressBook(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public Iterator createNameAlphabeticalIterator() {
        return new AddressBookNameAlphabeticalIterator(this);
    }

    @Override
    public Iterator createSurnameAlphabeticalIterator() {
        return new AddressBookSurnameAlphabeticalIterator(this);
    }
}
