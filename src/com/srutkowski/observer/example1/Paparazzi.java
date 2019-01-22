package com.srutkowski.observer.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Paparazzi implements Publisher {

    private List<Subscriber> newspapers = new ArrayList<>();
    private List<String> photos = new ArrayList<>();

    //In this case publisher decides what he wants to publish for his subscribers
    @Override
    public void notifySubscribers(int newPhotosAmount) {
        var newPhotos = getNewestPhotos(newPhotosAmount);
        newspapers.forEach(newspaper -> newspaper.update(newPhotos));
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        newspapers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        newspapers.remove(subscriber);
    }

    //Paparazzi can have set auto-notifying subscribers whenever new photos added
    public void addNewPhotos(List<String> newPhotos) {
        photos.addAll(newPhotos);
        notifySubscribers(newPhotos.size());
    }

    public void addNewPhoto(String photo) {
        photos.add(photo);
    }

    public void deletePhoto(String photoToDelete) {
        var photosToDelete = photos.stream()
                .filter(photo -> photo.equals(photoToDelete))
                .collect(Collectors.toList());
        photos.removeAll(photosToDelete);
    }

    private List<String> getNewestPhotos(int lastPhotosAmount) {
        var skip = photos.size() - lastPhotosAmount < 0 ? photos.size() : photos.size() - lastPhotosAmount;
        var limit = photos.size() - skip;
        return photos.stream().skip(skip).limit(limit).collect(Collectors.toList());
    }
}
