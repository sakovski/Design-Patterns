package com.srutkowski.facade.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public List<String> getBestFriends() {
        return contacts.stream()
                .filter(Contact::isBestFriend)
                .map(Contact::getName)
                .collect(Collectors.toList());
    }

    public String getContact(String name) {
        return contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst()
                .orElseGet(() -> this.addNewContact(name, false))
                .getName();
    }

    public Contact addNewContact(String name, boolean asBestFriend) {
        var contact = new Contact(asBestFriend, name);
        contacts.add(contact);
        return contact;
    }

    class Contact {
        private boolean isBestFriend;
        private String name;

        Contact(boolean isBestFriend, String name) {
            this.isBestFriend = isBestFriend;
            this.name = name;
        }

        public boolean isBestFriend() {
            return isBestFriend;
        }

        public void setBestFriend(boolean bestFriend) {
            isBestFriend = bestFriend;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
