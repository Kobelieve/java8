package com.kobe.practice.fortest;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ForeachDemo
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-30 20:59
 * @Version 1.0
 */
public class ForeachDemo {

    /**
     * 测试lambda的foreach循环
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "watermelon");
        list.forEach(str -> {
            System.out.println(str);
        });
    }

}
