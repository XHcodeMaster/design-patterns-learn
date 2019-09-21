package com.edu.simple.abstrac;

public class MaleHumanFactory extends AbstractHumanFactory{
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    public Human createWhitewuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
