package com.kobe.practice.colon;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 测试jdk1.8的双冒号用法
 */
public class DoubleColonDemo {

    public static void toUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public void toUpperCaseWrap(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {

        int num = 10;
        int a = num += 1;
        System.out.println(a);

        List<String> list = Lists.newArrayList("a", "b", "c");

        Consumer<String> consumer = DoubleColonDemo::toUpperCase;
        list.forEach(consumer);

        list.forEach(new DoubleColonDemo()::toUpperCaseWrap);
    }

}
