package com.edu.high.composite;

import java.util.ArrayList;

public interface IBranch {

    //增加叶子节点
    public void addSubordinate(ICrop leaf);
    //获得下级信息
    public ArrayList<ICrop> getSubordinateInfo();
}
