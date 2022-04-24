package com.renchao.factory.simplefactory.pizzastore.order;

import com.renchao.factory.simplefactory.pizzastore.pizza.Pizza;

//相当于一个客户端，发出订购
public class PizzaStore {
	public static void main(String[] args) {
//		new OrderPizza();
//		new OrderPizza02();
		//希腊披萨
		Pizza greek = SimpleFactory.createPizza("greek");

		//奶酪披萨
		Pizza cheese = SimpleFactory.createPizza("cheese");

		//胡椒披萨
		Pizza pepper = SimpleFactory.createPizza("pepper");
	}
}
