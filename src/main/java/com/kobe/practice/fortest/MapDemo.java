package com.kobe.practice.fortest;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapDemo
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-30 21:25
 * @Version 1.0
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "kobe");
        map.put("2", "curry");
        map.put("3", "durant");

        map.forEach((num, name) -> System.out.println(num));
    }

}
