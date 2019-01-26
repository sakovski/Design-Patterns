package com.srutkowski.abstractfactory.example1;

public class ZaksaTeamFactory implements AbstractTeamFactory {

    @Override
    public Setter createSetter() {
        return new ZaksaSetter("Benjamin", "Toniutti");
    }

    @Override
    public Opposite createOpposite() {
        return new ZaksaOpposite("Lukasz", "Kaczmarek");
    }

    @Override
    public Libero createLibero() {
        return new ZaksaLibero("Pawel", "Zatorski");
    }

    @Override
    public Receiver createReceiver1() {
        return new ZaksaReceiver("Sam", "Deroo");
    }

    @Override
    public Receiver createReceiver2() {
        return new ZaksaReceiver("Aleksander", "Sliwka");
    }

    @Override
    public MiddleBlocker createMiddleBlocker1() {
        return new ZaksaMiddleBlocker("Mateusz", "Bieniek");
    }

    @Override
    public MiddleBlocker createMiddleBlocker2() {
        return new ZaksaMiddleBlocker("Lukasz", "Wisniewski");
    }
}
