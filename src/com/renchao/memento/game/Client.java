package com.renchao.memento.game;

public class Client {

	public static void main(String[] args) {
		//创建游戏角色
		GameRole gameRole = new GameRole();
		gameRole.setVit(100);
		gameRole.setDef(100);
		
		System.out.println("和boss大战前的状态");
		gameRole.display();
		
		//把当前状态保存caretaker
		CareTaker caretaker = new CareTaker();
		caretaker.setMemento(gameRole.saveGameRole());
		
		System.out.println("和boss大战~~~");
		gameRole.setDef(30);
		gameRole.setVit(30);
		
		gameRole.display();
		
		System.out.println("大战后，使用备忘录对象恢复到站前");
		
		gameRole.recoverGameRole(caretaker.getMemento());
		System.out.println("恢复后的状态");
		gameRole.display();
	}

}
