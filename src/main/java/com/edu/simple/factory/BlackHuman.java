package com.edu.simple.factory;

public class BlackHuman implements Human {
    public void laugh() {
        System.out.println("黑色人类会哭");
    }

    public void cry() {
        System.out.println("黑色人类大笑，shabi！");
    }

    public void talk() {
        System.out.println("白色人类会说话，讲的啥玩意 垃圾");
    }
}
