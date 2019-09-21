package com.edu.simple.builder;

public class BenzModel extends CarModel {
    protected void start() {
        System.out.println("奔驰车跑起来是这个样子的....");
    }

    protected void stop() {
        System.out.println("奔驰车停车是这个样子的....");
    }

    protected void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的....");
    }

    protected void engineBoom() {
        System.out.println("奔驰车的引擎是这个样子的....");
    }
}
