package com.renchao.responsibilitychain;


//请求类
public class PurchaseRequest {

	private int type; //请求类型
	private float price; //请求金额
	private int id;
	//构造器
	public PurchaseRequest(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public float getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
}
