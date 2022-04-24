package com.renchao.factory.factorymethod.pizzastore.order;

import com.renchao.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.renchao.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.renchao.factory.factorymethod.pizzastore.pizza.Pizza;


public class BJFactory extends Factory {
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}
