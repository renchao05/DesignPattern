package com.renchao.factory.absfactory;


/**
 * 抽象工厂模式
 */
public class Client_AbstractFactory {

    public static void main(String[] args) {
        //现在，需要小米屏幕
        //1、找屏幕工厂（创建屏幕工厂）
        AbstractFactory screenFactory = new ScreenFactory();
        //2、屏幕工厂里生产出小米的屏幕
        XiaomiComponent xiaomiScreen = screenFactory.createXiaomi();
        //3、得到小米屏幕
        xiaomiScreen.produceComponent();

        //需要华为电池
        //1、找电池工厂
        BatteryFactory batteryFactory = new BatteryFactory();
        HuaweiComponent huaweiBattery = batteryFactory.createHuawei();
        huaweiBattery.produceComponent();
    }
}
