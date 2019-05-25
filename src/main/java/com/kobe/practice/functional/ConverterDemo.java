package com.kobe.practice.functional;

import org.junit.Test;

/**
 * @ClassName ConverterDemo
 * @Description ConverterDemo
 * @Author Tao
 * @Date 2019-04-30 17:42
 * @Version 1.0
 */
public class ConverterDemo {

    @Test
    public void m() {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer convert = converter.convert("888999");
        System.out.println(convert.getClass());
    }

    /**
     * ::引用静态方法
     */
    @Test
    public void m1() {
        Converter<String, Integer> converter = Integer::valueOf;
        Integer convert = converter.convert("888999");
        System.out.println(convert.getClass());
    }

}
