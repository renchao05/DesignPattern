package com.renchao.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		house.setBasic("地基100米");
	}

	@Override
	public void buildWalls() {
		house.setWall("墙厚20cm");
	}

	@Override
	public void roofed() {
		house.setRoofed("透明屋顶");
	}

}
