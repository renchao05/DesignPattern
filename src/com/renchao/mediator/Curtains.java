package com.renchao.mediator;

public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void send(int stateChange) {
		mediator.relay(stateChange, this.name);
	}

	public void upCurtains() {
		System.out.println("正在拉下幕布!");
	}

}
