package com.renchao.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责保存和恢复Originator的状态，状态是保存在这类里面的。
 */
public class CareTaker {
	
	//在List 集合中会有很多的备忘录对象
	private final List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//获取到第index个Originator 的 备忘录对象(即保存状态)
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
