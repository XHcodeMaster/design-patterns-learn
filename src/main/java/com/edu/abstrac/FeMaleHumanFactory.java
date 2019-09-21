package com.edu.abstrac;

public class FeMaleHumanFactory extends AbstractHumanFactory {
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    public Human createWhitewuman() {
        return super.createHuman(HumanEnum.WhiteFeMaleHuman);
    }

    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFeMaleHuman);
    }
}
