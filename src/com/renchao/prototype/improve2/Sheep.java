package com.renchao.prototype.improve2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
//实现 Cloneable ，Object.clone() 方法才可以合法地克隆。
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private Sheep friend;

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        if (sheep.getFriend() != null) {    //深拷贝
            sheep.setFriend((Sheep) sheep.getFriend().clone());
        }
        return sheep;
    }
}
