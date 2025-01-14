package com.renchao.factory.simplefactory.pizzastore.order;

import com.renchao.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.renchao.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.renchao.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.renchao.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

	//简单工厂模式 也叫 静态工厂模式
	public static Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式2");
		switch (orderType) {
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
		return pizza;
	}
}
