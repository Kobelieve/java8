package com.kobe.practice.functional;

import org.junit.Test;

/**
 * @ClassName LambdaScopeDemo
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-25 21:50
 * @Version 1.0
 */
public class LambdaScopeDemo {

    @Test
    public void m() {
//        final int num = 1;
        int num = 1;
        Converter<Integer, String> converter = (from) -> String.valueOf(from + num);
        String convert = converter.convert(99);
        System.out.println(convert);
//        num = 2;
    }

}
