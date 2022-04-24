package com.renchao.builder.improve;

//产品->Product
public class House {
	private String Basic;
	private String wall;
	private String roofed;


	public void setBasic(String basic) {
		this.Basic = basic;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}

	@Override
	public String toString() {
		return "House{" +
				"Basic='" + Basic + '\'' +
				", wall='" + wall + '\'' +
				", roofed='" + roofed + '\'' +
				'}';
	}
}
