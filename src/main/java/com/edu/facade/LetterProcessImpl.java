package com.edu.facade;

public class LetterProcessImpl implements LetterProcess {

    public void writeContext(String context) {
        System.out.println("填写信的内容...."+context);
    }

    public void fillEnvelop(String address) {
        System.out.println("填写信封的内容.收件人..地址..."+address);
    }

    public void letterInotoEnvelop() {
        System.out.println("letterInotoEnvelop...");
    }

    public void sendLetter() {
        System.out.println("sendLetter...");
    }
}
