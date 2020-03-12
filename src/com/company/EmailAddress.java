package com.company;

public class EmailAddress extends Contact {

    private String emailAddress;

    public EmailAddress(String name, String emailAddress) {
        super(name);
        this.emailAddress = emailAddress;
    }

    @Override
    public void contactMethod() {
        System.out.println("Emailing: "+ emailAddress);
    }
}
