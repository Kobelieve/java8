package com.kobe.practice.blog;

public class Test1 {

    public static final String STR = "hhh";
    public static final int num = 666; // 类不会被初始化
    public static final Integer num1 = 666; // 类会被初始化
    public static final boolean flag = true;

    static {
        System.out.println("初始化了.....");
    }

}
