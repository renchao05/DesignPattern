package com.renchao.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.renchao.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	Pizza pizza;
	public OrderPizza() {
		do {
			pizza = SimpleFactory.createPizza(getType());
			//输出pizza
			if(pizza != null) { //订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" 订购披萨失败 ");
				break;
			}
		}while(true);
	}
	
	// 写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			return strin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
