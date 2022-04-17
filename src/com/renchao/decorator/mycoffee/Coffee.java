package com.renchao.decorator.mycoffee;

import com.renchao.decorator.Drink;

public class Coffee  extends Drink {

	@Override
	public float cost() {
		return getPrice();
	}
}
