package com.renchao.builder.computerImprove;

public class Client {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        MacComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");
        ComputerBuilder computerBuilder = director.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        System.out.println(macComputer);

        ComputerBuilder lenovoBuilder=new LenovoComputerBuilder("I7处理器","海力士222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer=lenovoBuilder.getComputer();
        System.out.println("lenovo computer:"+lenovoComputer.toString());
    }
}
