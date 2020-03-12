package com.company;

public class Main {

    public static void main(String[] args) {

        PhoneNumber phone1 = new PhoneNumber("Tanner", "614-254-3978");
        EmailAddress email1 = new EmailAddress("Tanner", "tgragg@student.cscc.edu");
        phone1.contactMethod();
        email1.contactMethod();

    }
}
