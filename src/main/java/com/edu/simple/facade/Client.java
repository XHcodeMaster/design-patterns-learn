package com.edu.simple.facade;

public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("adsda","dasaddress");
    }
}
