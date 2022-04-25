package com.renchao.bridge;

public abstract class Phone {
    protected final Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();

    public abstract void close();

    public abstract void call();
}
