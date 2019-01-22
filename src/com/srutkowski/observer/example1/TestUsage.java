package com.srutkowski.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class TestUsage {

    public static void main(String... args) {
        var paparazzi = new Paparazzi();

        var fakePaper = new FakePaper();
        var gossipPaper = new GossipPaper();

        paparazzi.addSubscriber(fakePaper);
        paparazzi.addSubscriber(gossipPaper);

        List<String> newPhotos = new ArrayList<>();
        newPhotos.add("Angelina Jolie");
        newPhotos.add("Miley Cyrus");
        paparazzi.addNewPhotos(newPhotos);

        paparazzi.removeSubscriber(fakePaper);

        var radcliffePhoto = "Daniel Radcliffe";
        paparazzi.addNewPhoto(radcliffePhoto);
        paparazzi.notifySubscribers(1);
    }
}
