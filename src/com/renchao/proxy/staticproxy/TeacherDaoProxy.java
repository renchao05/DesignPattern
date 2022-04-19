package com.renchao.proxy.staticproxy;

//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao{

	private ITeacherDao target; // 目标对象，通过接口来聚合

	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {
		System.out.println("开始上课了。。。。。 ");//方法
		target.teach();
		System.out.println("下课了。。。。。");//方法
	}
}
