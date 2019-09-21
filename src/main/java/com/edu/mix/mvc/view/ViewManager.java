package com.edu.mix.mvc.view;

import com.edu.mix.mvc.model.ValueStack;
import com.edu.mix.mvc.model.ValueStackHelper;

public class ViewManager {
    //Action的名称
    private String actionName;
    //当前的值栈
    private ValueStack valueStack = ValueStackHelper.getValueStack();

    //接收一个ActionName
    public ViewManager(String _actionName) {
        this.actionName = _actionName;
    }

    //根据模型的返回结果提供视图
    public String getViewPath(String result) {
//根据值栈查找到需要提供的语言
        AbsLangData langData = new GBLangData();
//根据action和result查找到指定的视图，并加载语言
        AbsView view = new JspView(langData);
//返回视图的地址
        return view.getURI();
    }
}