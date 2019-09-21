package com.edu.mix.mvc.model;

public abstract class ActionSupport {
    public final static String SUCCESS = "success";
    public final static String FAIL = "fail";

    //默认的执行方法
    public String execute() {
        return SUCCESS;
    }
}