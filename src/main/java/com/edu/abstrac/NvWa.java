package com.edu.abstrac;

public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleHumanFactory();
        HumanFactory feMaleFactory = new FeMaleHumanFactory();
        Human male = maleFactory.createYellowHuman();
        Human feMale = feMaleFactory.createYellowHuman();
        male.cry();
        male.sex();
        feMale.cry();
        feMale.sex();
    }
}
