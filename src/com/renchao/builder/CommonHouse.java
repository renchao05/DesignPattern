package com.renchao.builder;

public class CommonHouse extends AbstractHouse {

	@Override
	public void buildBasic() {
		System.out.println(" 普通房子打地基5米 ");
		house.setBaise("地基5米");
	}

	@Override
	public void buildWalls() {
		System.out.println(" 普通房子砌墙10cm ");
		house.setWall("墙厚10cm");
	}

	@Override
	public void roofed() {
		System.out.println(" 普通房子屋顶 ");
		house.setRoofed("普通屋顶");
	}

}
