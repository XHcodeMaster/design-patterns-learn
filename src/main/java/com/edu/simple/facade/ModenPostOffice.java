package com.edu.simple.facade;

public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();
    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelop(address);
        police.checkLetter(letterProcess);
        letterProcess.letterInotoEnvelop();
        letterProcess.sendLetter();
    }
}
