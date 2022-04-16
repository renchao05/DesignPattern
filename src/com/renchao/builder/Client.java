package com.renchao.builder;

public class Client {

	public static void main(String[] args) {
		CommonHouse commonHouse = new CommonHouse();
		House house1 = commonHouse.build();
		System.out.println(house1);

		System.out.println("===================");
		HighBuilding highBuilding = new HighBuilding();
		House house2 = highBuilding.build();
		System.out.println(house2);

	}

}
