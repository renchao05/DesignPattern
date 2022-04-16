package com.renchao.builder.computerSimple;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("英特尔", "三星")
                .setDisplay("三星")
                .setKeyboard("双飞燕")
                .setUsbCount(4).build();
    }
}
