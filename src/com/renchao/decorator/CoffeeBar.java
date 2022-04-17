package com.renchao.decorator;

import com.renchao.decorator.Drink;
import com.renchao.decorator.mycoffee.DeCaf;
import com.renchao.decorator.mycoffee.LongBlack;
import com.renchao.decorator.mydecorator.Chocolate;
import com.renchao.decorator.mydecorator.Milk;

public class CoffeeBar {

	public static void main(String[] args) {
		// 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

		// 1. 点一份 LongBlack
		Drink order = new LongBlack();
		System.out.println("费用：" + order.cost() + "元");
		System.out.println("描述：" + order.getDes());

		// 2. order 加入一份牛奶
		order = new Milk(order);
		System.out.println("\n加入一份牛奶\n费用：\n\t" + order.cost() + "元");
		System.out.println("商品：\n\t" + order.getDes());

		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("\n加入一份巧克力\n费用：\n\t" + order.cost() + "元");
		System.out.println("商品：\n\t" + order.getDes());

		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("\n加入一份巧克力\n费用：\n\t" + order.cost() + "元");
		System.out.println("商品：\n\t" + order.getDes());

	}

}
