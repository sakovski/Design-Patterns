package com.srutkowski.observer.example1;

import java.util.List;

public class FakePaper implements Subscriber {

    @Override
    public void update(List<String> photos) {
        var photosToPrint = String.join(",", photos);
        System.out.println("Actually, we don't need this photos, we must consider unsub.");
        System.out.println("Photos came: " + photosToPrint);
    }
}
