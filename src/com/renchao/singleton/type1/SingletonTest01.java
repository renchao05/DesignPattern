package com.renchao.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
//        Singleton02 singleton = Singleton02.getSingleton();
//        Singleton02 singleton2 = Singleton02.getSingleton();
//        System.out.println(singleton == singleton2);

        new t1().start();
        new t2().start();

    }
}

class t1 extends Thread {
    @Override
    public void run() {
//        Singleton instance = Singleton.getInstance();
        Singleton instance = Singleton.INSTANCE;
        System.out.println(instance.hashCode());
    }
}

class t2 extends Thread {
    @Override
    public void run() {
//        Singleton instance = Singleton.getInstance();
        Singleton instance = Singleton.INSTANCE;
        System.out.println(instance.hashCode());
    }
}