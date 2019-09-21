package com.edu.factory;

import java.util.List;
import java.util.Random;

public class HumanFactory {

    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("必须指定人类的颜色");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("人类定义错误");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("指定的人类找不到");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;

    }
}
