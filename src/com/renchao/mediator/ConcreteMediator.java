package com.renchao.mediator;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {
	//集合，放入所有的同事对象
	private final HashMap<String, Colleague> colleagueMap;
	private final HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<>();
		interMap = new HashMap<>();
	}

	@Override
	public void register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);

		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}

	}

	//具体中介者的核心方法
	//1. 根据得到消息，完成对应任务
	//2. 中介者在这个方法，协调各个具体的同事对象，完成任务
	@Override
	public void relay(int stateChange, String colleagueName) {
		//处理闹钟发出的消息
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				//开始制作咖啡
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).start();
				//打开电视
				((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
			} else if (stateChange == 1) {
				//关闭电视
				((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
			}
		//处理咖啡机发出的消息
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();

		//处理TV发出的消息
		} else if (colleagueMap.get(colleagueName) instanceof TV) {

		//处理窗帘发出的消息
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {

		}

	}

}
