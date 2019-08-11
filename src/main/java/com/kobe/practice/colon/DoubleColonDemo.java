package com.kobe.practice.colon;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 测试jdk1.8的双冒号用法
 */
public class DoubleColonDemo {

    /**
     * 类名::方法名
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Object> list = Lists.newArrayList(1,2,3);
        list.forEach(System.out::println);
    }

}
