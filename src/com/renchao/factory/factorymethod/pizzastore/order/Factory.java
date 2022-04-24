package com.renchao.factory.factorymethod.pizzastore.order;


import com.renchao.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class Factory {
	//定义一个抽象方法，createPizza , 让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);
}
