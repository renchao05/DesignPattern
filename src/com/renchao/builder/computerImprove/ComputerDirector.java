package com.renchao.builder.computerImprove;

public class ComputerDirector {
    ComputerBuilder computerBuilder = null;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public ComputerBuilder makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
        return this.computerBuilder;
    }
}
