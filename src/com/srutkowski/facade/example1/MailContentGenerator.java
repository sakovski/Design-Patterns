package com.srutkowski.facade.example1;

public class MailContentGenerator {

    public String getWelcomeContent(String receiver, String template) {
        return String.format("%s HELLO %s! Long time no see :)", template, receiver);
    }

    public String getBusinessOfferContent(String receiver, String template) {
        return String.format("%s Hello %s! We have a nice offer for you!", template, receiver);
    }
}
