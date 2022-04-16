package com.renchao.prototype.improve3;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色",new Sheep("jeck",2,"黑色",null));

        List<Sheep> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sheep.deepClone());
        }

        list.forEach(sheep2 -> System.out.println(sheep2.hashCode()));
    }

}
