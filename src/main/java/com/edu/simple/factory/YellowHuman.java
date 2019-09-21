package com.edu.simple.factory;

public class YellowHuman implements Human {
    public void laugh() {
        System.out.println("黄色人类会哭");
    }

    public void cry() {
        System.out.println("黄色人类大笑，幸福呀！");
    }

    public void talk() {
        System.out.println("黄色人类会说话，双字节");
    }
}
