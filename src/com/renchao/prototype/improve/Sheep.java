package com.renchao.prototype.improve;


import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@ToString
//实现 Cloneable ，Object.clone() 方法才可以合法地克隆。
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
