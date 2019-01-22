package com.srutkowski.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class GossipPaper implements Subscriber {

    private List<String> hottestPhotos = new ArrayList<>();

    @Override
    public void update(List<String> photos) {
        var photosToPrint = String.join(",", photos);
        System.out.println("Tasty, new photos. Lets destroy some lives!!!");
        System.out.println("Lives to destroy: " + photosToPrint);
        hottestPhotos.addAll(photos);
    }
}
