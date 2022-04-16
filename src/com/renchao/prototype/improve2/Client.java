package com.renchao.prototype.improve2;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色",new Sheep("jeck",2,"黑色",null));

        List<Sheep> list = new ArrayList<>();
        try {
            list.add((Sheep) sheep.clone());
            list.add((Sheep) sheep.clone());
            list.add((Sheep) sheep.clone());
            list.add((Sheep) sheep.clone());
            list.add((Sheep) sheep.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        list.forEach(sheep2 -> System.out.println(sheep2.hashCode()));
    }

}
