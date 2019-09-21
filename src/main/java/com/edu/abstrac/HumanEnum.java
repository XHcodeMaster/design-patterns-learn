package com.edu.abstrac;

public enum HumanEnum {
    YellowMaleHuman("YellowMaleHuman"),
    YellowFemaleHuman("YellowFemaleHuman"),
    WhiteMaleHuman("WhiteMaleHuman"),
    WhiteFeMaleHuman("WhiteFeMaleHuman"),
    BlackMaleHuman("BlackMaleHuman"),
    BlackFeMaleHuman("BlackFeMaleHuman"),
    ;
    private String value="";
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
