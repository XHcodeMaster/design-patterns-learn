package com.edu.simple.single;

public class Single {

    private static volatile Single single;

    private Single(){}
    public static Single getSingle() {
        if (single == null) {
            synchronized (Single.class) {
                if (single == null) {
                    single = new Single();
                }
            }
        }
        return single;
    }

}
