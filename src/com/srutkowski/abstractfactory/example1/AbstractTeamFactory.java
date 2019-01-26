package com.srutkowski.abstractfactory.example1;

public interface AbstractTeamFactory {
    Setter createSetter();
    Opposite createOpposite();
    Libero createLibero();
    Receiver createReceiver1();
    Receiver createReceiver2();
    MiddleBlocker createMiddleBlocker1();
    MiddleBlocker createMiddleBlocker2();
}
