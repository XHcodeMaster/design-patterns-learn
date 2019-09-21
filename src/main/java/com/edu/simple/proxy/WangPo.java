package com.edu.simple.proxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo(){
        this.kindWomen = new PanJinLian();
    }
    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    public void makeEysWithMan() {
        kindWomen.makeEysWithMan();
    }

    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}
