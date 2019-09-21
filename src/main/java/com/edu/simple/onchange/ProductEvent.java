package com.edu.simple.onchange;


import java.util.Observable;

public class ProductEvent extends Observable {

    private Product source;
    private ProductEventType type;

    public ProductEvent(Product p){
        this(p,ProductEventType.NEW_PRODUCT);
    }
    public ProductEvent(Product p,ProductEventType _type){
        this.source = p;
        this.type = _type;
        //事件触发
        notifyEventDispatch();
    }
    //获得事件的始作俑者
    public Product getSource(){
        return source;
    }
    //获得事件的类型
    public ProductEventType getEventType(){
        return this.type;
    }
    //通知事件处理中心
    private void notifyEventDispatch(){
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }

}
