package com.renchao.mediator;

public class TV extends Colleague {

	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.register(name, this);
	}

	@Override
	public void send(int stateChange) {
		mediator.relay(stateChange, this.name);
	}

	public void startTV() {
		System.out.println("It's time to StartTv!");
	}

	public void stopTV() {
		System.out.println("StopTv!");
	}
}
