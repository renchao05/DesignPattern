package com.renchao.decorator.mydecorator;

import com.renchao.decorator.Drink;

public class Soy extends Decorator{

	public Soy(Drink obj) {
		super(obj);
		setDes(" 豆浆  ");
		setPrice(1.5f);
	}

}
