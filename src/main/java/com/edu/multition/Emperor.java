package com.edu.multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumberOfEmperor = 2;
    //皇帝名字
    private static ArrayList emperorInfoList = new ArrayList(maxNumberOfEmperor);
    //皇帝列表
    private static ArrayList emperorList = new ArrayList(maxNumberOfEmperor);
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumberOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor() {
    }

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumberOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
