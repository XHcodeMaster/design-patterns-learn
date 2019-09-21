package com.edu.simple.single;

public class Emperor {
    private static Emperor emperor = null;
    public static Emperor getInstance(){
        if(emperor ==null){
            emperor = new Emperor();
        }
        return emperor;
    }
    public static void  emperorInfo(){
        System.out.println("我是皇帝么么么..");
    }
}
