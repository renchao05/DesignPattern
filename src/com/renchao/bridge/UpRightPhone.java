package com.renchao.bridge;

public class UpRightPhone extends Phone {

		//构造器
		public UpRightPhone(Brand brand) {
			super(brand);
		}
		
		public void open() {
			System.out.println("直立样式手机: ");
			brand.open();
		}
		
		public void close() {
			System.out.println("直立样式手机: ");
			brand.close();
		}
		
		public void call() {
			System.out.println("直立样式手机: ");
			brand.call();
		}
}
