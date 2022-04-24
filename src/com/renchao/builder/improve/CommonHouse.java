package com.renchao.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBasic("地基5米");
	}

	@Override
	public void buildWalls() {
		house.setWall("墙厚10cm");
	}

	@Override
	public void roofed() {
		house.setRoofed("普通屋顶");
	}

}
