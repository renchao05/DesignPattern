package com.renchao.memento.theory;

/**
 * 对象(需要保存状态的对象)
 */
public class Originator {

	private String state;//状态信息

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//保存一个状态对象 Memento
	public Memento saveState() {
		return new Memento(state);
	}
	
	//通过 Memento 备忘录对象，恢复状态
	public void restoreState(Memento memento) {
		state = memento.getState();
	}
}
