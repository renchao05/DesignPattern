package com.renchao.factory.simplefactory.pizzastore.order2;

import com.renchao.factory.simplefactory.pizzastore.order.SimpleFactory;
import com.renchao.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.renchao.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.renchao.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.renchao.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    Pizza pizza;

    public OrderPizza() {
        switch (getType()) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
                break;
        }
        //输出pizza
        if (pizza != null) { //订购成功
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println(" 订购披萨失败 ");
        }
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
