package com.renchao.factory.factorymethod.pizzastore.order;

import com.renchao.factory.factorymethod.pizzastore.pizza.Pizza;

public class OrderPizza {
    public static void main(String[] args) {
        //创建北京口味的各种Pizza
        BJFactory bjFactory = new BJFactory();
        //北京口味奶酪披萨
        Pizza bjCheese = bjFactory.createPizza("cheese");
        //北京口味胡椒披萨
        Pizza bjPepper = bjFactory.createPizza("pepper");

        //创建伦敦口味的各种Pizza
        LDFactory ldFactory = new LDFactory();
        //伦敦口味奶酪披萨
        Pizza ldCheese = ldFactory.createPizza("cheese");
        //伦敦口味胡椒披萨
        Pizza ldPepper = ldFactory.createPizza("pepper");
    }
}
