package com.renchao.mediator;

//同事抽象类
public abstract class Colleague {
	protected final Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(int stateChange);
}
