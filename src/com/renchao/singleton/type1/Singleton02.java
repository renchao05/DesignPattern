package com.renchao.singleton.type1;

public class Singleton02 {
    private static final Singleton02 singleton;
    static {
        singleton = new Singleton02();
    }
    private Singleton02() {}  //构造器私有化
    public static Singleton02 getSingleton() {
        return singleton;
    }
}
