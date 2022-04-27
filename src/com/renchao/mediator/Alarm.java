package com.renchao.mediator;

//具体的同事类
public class Alarm extends Colleague {

	//构造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//在创建 闹钟 同事对象时，将自己放入到ConcreteMediator 对象中[集合]
		mediator.register(name, this);
	}

	public void sendAlarm(int stateChange) {
		send(stateChange);
	}

	@Override
	public void send(int stateChange) {
		//调用的中介者对象的getMessage
		mediator.relay(stateChange, this.name);
	}

}
