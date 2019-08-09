package com.kobe.practice.optional;

public class Test {
    public static void main(String[] args) {
        Strategy strategy = Strategy.valueOf(Strategy.SMOOTH.toString());
        strategy.run();
    }
}
