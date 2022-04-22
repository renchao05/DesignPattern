package com.renchao.memento.theory;

/**
 * 存储状态的类，里面没有业务逻辑，一般是一个POJO。
 */
public class Memento {
	private final String state;

	//构造器
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
