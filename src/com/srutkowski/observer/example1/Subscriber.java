package com.srutkowski.observer.example1;

import java.util.List;

public interface Subscriber {

    void update(List<String> photos);
}
