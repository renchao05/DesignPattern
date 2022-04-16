package com.renchao.factory.factorymethod.pizzastore.order;

public class OrderPizza {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//创建北京口味的各种Pizza
			new BJFactory();
		} else {
			//创建伦敦口味的各种Pizza
			new LDFactory();
		}
		
	}

}
