package com.edu.strategy;

public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        System.out.println("----------------刚刚吴国的时候拆第一个-------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n");

        System.out.println("----------------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n");

        System.out.println("----------------孙权小兵追来了，拆第二个了-------------");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n");
    }

}
