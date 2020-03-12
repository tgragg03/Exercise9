package com.company;

public class PhoneNumber extends Contact {
    private String phoneNum;

    public PhoneNumber(String name, String phoneNum) {
        super(name);
        this.phoneNum = phoneNum;
    }

    @Override
    public void contactMethod() {
        System.out.println("Calling: "+phoneNum);
    }
}
