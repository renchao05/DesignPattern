package com.renchao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;

public class Client {
	public static void main(String[] args) {
		//创建目标对象
		ITeacherDao target = new TeacherDao();
		
		//创建代理对象, 可以转成 ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

		//通过代理对象，调用目标对象的方法
		proxyInstance.teach();
	}
}
