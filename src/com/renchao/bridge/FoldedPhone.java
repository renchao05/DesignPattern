package com.renchao.bridge;

public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("折叠手机：");
        brand.open();
    }

    @Override
    public void close() {
        System.out.println("折叠手机：");
        brand.close();
    }

    @Override
    public void call() {
        System.out.println("折叠手机：");
        brand.call();
    }
}
