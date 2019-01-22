package com.srutkowski.observer.example1;

public interface Publisher {

    void notifySubscribers(int newPhotosAmount);
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
}
