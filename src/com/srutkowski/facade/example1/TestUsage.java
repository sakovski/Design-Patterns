package com.srutkowski.facade.example1;

public class TestUsage {

    public static void main(String... args) {
        var mailFacade = new MailSenderFacade(new MailTemplateProvider(), new MailContentGenerator(), new AddressBook(), new MailSender());
        mailFacade.addReceiverToAddressBook("John", true);
        mailFacade.addReceiverToAddressBook("Joe", true);
        mailFacade.addReceiverToAddressBook("Pavel", false);

        mailFacade.sendWelcomeMailToBestFriends();

        mailFacade.sendBusinessOfferMailTo("Kamil");
        mailFacade.sendBusinessOfferMailTo("John");
    }
}
