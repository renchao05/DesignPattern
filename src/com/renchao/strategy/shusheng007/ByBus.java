package com.renchao.strategy.shusheng007;

//乘坐公交车算法
public class ByBus implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance<10?4:6;
    }
}
