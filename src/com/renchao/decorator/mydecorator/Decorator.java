package com.renchao.decorator.mydecorator;

import com.renchao.decorator.Drink;

public class Decorator extends Drink {
	private final Drink obj;
	
	public Decorator(Drink obj) { //组合
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// getPrice 自己价格
		return getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// obj.getDes() 输出被装饰者的信息
		return des + getPrice() + "元\n\t" + obj.getDes();
	}
}
