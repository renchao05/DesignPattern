package com.renchao.template.improve;

public class PureSoyMilk extends SoyMilk {

	@Override
	void addCondiments() {
		//空实现
	}
	
	@Override
	boolean customerWantCondiments() {
		return false;
	}
 
}
