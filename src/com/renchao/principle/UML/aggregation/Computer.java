package com.renchao.principle.UML.aggregation;

public class Computer {
    private Mouse mouse;
    private Moniter moniter;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}


