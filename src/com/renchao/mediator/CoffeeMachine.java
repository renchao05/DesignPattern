package com.renchao.mediator;

public class CoffeeMachine extends Colleague {

	public CoffeeMachine(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void send(int stateChange) {
		mediator.relay(stateChange, this.name);
	}

	public void start() {
		System.out.println("开始制作咖啡");
	}

	public void finish() {
		System.out.println("5分钟后!");
		System.out.println("咖啡制作完成!");
		send(0);
	}
}
