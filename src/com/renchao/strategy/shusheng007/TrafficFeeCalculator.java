package com.renchao.strategy.shusheng007;

public class TrafficFeeCalculator {
    public int goToTianJinEye(CalculateStrategy strategy,int distance){
        return strategy.calculateTrafficFee(distance);
    }
}
