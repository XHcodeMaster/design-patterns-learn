package com.edu.mix.mvc.model;

public abstract class AbstractInterceptor {
    //获得当前的值栈
    private ValueStack valueStack = ValueStackHelper.getValueStack();
    //拦截器类型：前置、后置、环绕
    private int type = 0;

    //当前的值栈
    protected ValueStack getValueStack() {
        return valueStack;
    }

    //拦截处理
    public final void exec() {
//根据type不同，处理方式也不同
    }

    //拦截器类型
    protected abstract void setType(int type);

    //子类实现的拦截器
    protected abstract void intercept();
}