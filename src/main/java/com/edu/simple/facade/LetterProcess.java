package com.edu.simple.facade;

public interface LetterProcess {
    /**
     * 信的内容
     *
     * @param context
     */
    public void writeContext(String context);

    //信封
    public void fillEnvelop(String address);

    //信放入信封
    public void letterInotoEnvelop();

    //邮递
    public void sendLetter();
}
