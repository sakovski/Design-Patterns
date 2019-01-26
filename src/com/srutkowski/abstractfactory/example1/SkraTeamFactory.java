package com.srutkowski.abstractfactory.example1;

public class SkraTeamFactory implements AbstractTeamFactory {

    @Override
    public Setter createSetter() {
        return new SkraSetter("Grzegorz", "Lomacz");
    }

    @Override
    public Opposite createOpposite() {
        return new SkraOpposite("Mariusz", "Wlazly");
    }

    @Override
    public Libero createLibero() {
        return new SkraLibero("Kacper", "Piechocki");
    }

    @Override
    public Receiver createReceiver1() {
        return new SkraReceiver("Artur", "Szalpuk");
    }

    @Override
    public Receiver createReceiver2() {
        return new SkraReceiver("Milad", "Ebadipour");
    }

    @Override
    public MiddleBlocker createMiddleBlocker1() {
        return new SkraMiddleBlocker("Karol", "Klos");
    }

    @Override
    public MiddleBlocker createMiddleBlocker2() {
        return new SkraMiddleBlocker("Jakub", "Kochanowski");
    }
}
