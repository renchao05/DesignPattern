package com.renchao.template.improve;

public class Client {

	public static void main(String[] args) {
		//制作红豆豆浆
		
		System.out.println("----制作红豆豆浆----");
		SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
		redBeanSoyMilk.make();
		
		System.out.println("----制作花生豆浆----");
		SoyMilk peanutSoyMilk = new PeanutSoyMilk();
		peanutSoyMilk.make();
		
		System.out.println("----制作纯豆浆----");
		SoyMilk pureSoyMilk = new PureSoyMilk();
		pureSoyMilk.make();
	}

}
