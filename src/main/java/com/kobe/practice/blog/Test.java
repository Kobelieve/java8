package com.kobe.practice.blog;

public class Test {

    public static void main(String[] args) {
        System.out.println(Inner.class.hashCode());
        System.out.println(Inner.num);
    }

    static class Inner {
        static int num = 5;
        static {
            System.out.println("静态代码块执行...");
        }
    }

}
