package com.renchao.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println(" 高楼的打地基100米 ");
		house.setBaise("地基100米");
	}

	@Override
	public void buildWalls() {
		System.out.println(" 高楼的砌墙20cm ");
		house.setWall("墙厚20cm");
	}

	@Override
	public void roofed() {
		System.out.println(" 高楼的透明屋顶 ");
		house.setRoofed("透明屋顶");
	}

}
