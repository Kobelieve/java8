package com.kobe.practice.fortest;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SreamDemo
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-30 21:31
 * @Version 1.0
 */
public class SreamDemo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");

        for (String str : stringList) {
            if (str.startsWith("a")) {
                System.out.println(str);
            }
        }

        stringList
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

    }

}
