package com.renchao.factory.factorymethod.pizzastore.order;

import com.renchao.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.renchao.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.renchao.factory.factorymethod.pizzastore.pizza.Pizza;


public class LDFactory extends Factory {
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
