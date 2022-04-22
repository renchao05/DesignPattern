package com.renchao.memento.theory;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker caretaker = new CareTaker();
		originator.setState(" 状态#1 攻击力 100 ");
		
		//保存了当前的状态
		caretaker.add(originator.saveState());
		
		originator.setState(" 状态#2 攻击力 80 ");
		caretaker.add(originator.saveState());
		
		originator.setState(" 状态#3 攻击力 50 ");
		caretaker.add(originator.saveState());

		System.out.println("当前的状态是 =" + originator.getState());
		
		//希望恢复到状态 1, 将 originator 恢复到状态1
		originator.restoreState(caretaker.get(0));
		System.out.println("当前的状态是 =" + originator.getState());
	}
}
