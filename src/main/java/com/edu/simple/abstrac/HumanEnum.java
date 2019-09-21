package com.edu.simple.abstrac;

public enum HumanEnum {
    YellowMaleHuman("com.edu.simple.abstrac.YellowMaleHuman"),
    YellowFemaleHuman("com.edu.simple.abstrac.YellowFemaleHuman"),
    WhiteMaleHuman("com.edu.simple.abstrac.WhiteMaleHuman"),
    WhiteFeMaleHuman("com.edu.simple.abstrac.WhiteFeMaleHuman"),
    BlackMaleHuman("com.edu.simple.abstrac.BlackMaleHuman"),
    BlackFeMaleHuman("com.edu.simple.abstrac.BlackFeMaleHuman"),
    ;
    private String value="";
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
