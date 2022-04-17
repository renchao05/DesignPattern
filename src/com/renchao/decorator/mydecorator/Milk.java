package com.renchao.decorator.mydecorator;

import com.renchao.decorator.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDes(" 牛奶 ");
		setPrice(2.0f); 
	}

}
