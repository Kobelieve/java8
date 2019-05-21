package com.kobe.practice.interfaces;

/**
 * @ClassName Formula
 * @Description Formula
 * @Author Tao
 * @Date 2019-04-30 16:30
 * @Version 1.0
 */
public interface Formula {

    double calculate(int a);

    /**
     * 使用default关键字向接口添加非抽象方法。此功能也称为虚拟扩展方法
     * @param a
     * @return
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
