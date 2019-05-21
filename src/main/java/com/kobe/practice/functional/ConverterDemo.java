package com.kobe.practice.functional;

/**
 * @ClassName ConverterDemo
 * @Description ConverterDemo
 * @Author Tao
 * @Date 2019-04-30 17:42
 * @Version 1.0
 */
public class ConverterDemo {

    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer num = converter.convert("123");
        System.out.println(num.getClass());
    }

}
