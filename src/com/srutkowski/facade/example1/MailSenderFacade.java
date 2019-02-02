package com.srutkowski.facade.example1;

public class MailSenderFacade {

    private MailTemplateProvider mailTemplateProvider;
    private MailContentGenerator mailContentGenerator;
    private AddressBook addressBook;
    private MailSender mailSender;

    public MailSenderFacade(MailTemplateProvider mailTemplateProvider, MailContentGenerator mailContentGenerator, AddressBook addressBook, MailSender mailSender) {
        this.mailTemplateProvider = mailTemplateProvider;
        this.mailContentGenerator = mailContentGenerator;
        this.addressBook = addressBook;
        this.mailSender = mailSender;
    }

    public void sendBusinessOfferMailTo(String receiver) {
        var template = mailTemplateProvider.getBusinessOfferTemplate();
        var receiverName = addressBook.getContact(receiver);
        var content = mailContentGenerator.getBusinessOfferContent(receiverName, template);
        mailSender.sendMail(content, receiverName);
    }

    public void sendWelcomeMailToBestFriends() {
        var template = mailTemplateProvider.getWelcomeTemplate();
        var bestFriends = addressBook.getBestFriends();
        bestFriends.forEach(friend -> {
            var content = mailContentGenerator.getWelcomeContent(friend, template);
            mailSender.sendMail(content, friend);
        });
    }

    public void addReceiverToAddressBook(String contact, boolean isBestFriend) {
        addressBook.addNewContact(contact, isBestFriend);
    }
}
