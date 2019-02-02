package com.srutkowski.facade.example1;

public class MailSender {

    public void sendMail(String content, String receiver) {
        System.out.println(String.format("SENDING MAIL TO %s with content: %s", receiver, content));
    }
}
