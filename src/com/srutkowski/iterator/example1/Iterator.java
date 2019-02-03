package com.srutkowski.iterator.example1;

import java.util.Optional;

public interface Iterator {

    Optional<Address> getNext();
    boolean hasNext();
}
