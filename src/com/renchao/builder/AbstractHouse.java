package com.renchao.builder;

public abstract class AbstractHouse {
	protected House house = new House();
	
	//打地基
	public abstract void buildBasic();
	//砌墙
	public abstract void buildWalls();
	//封顶
	public abstract void roofed();
	
	public House build() {
		buildBasic();
		buildWalls();
		roofed();
		return house;
	}
	
}
