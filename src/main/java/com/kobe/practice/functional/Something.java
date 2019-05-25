package com.kobe.practice.functional;

/**
 * @ClassName Something
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-25 21:11
 * @Version 1.0
 */
public class Something {

    public String startsWith(String str) {
        return String.valueOf(str.charAt(0));
    }

    /**
     * ::引用对象方法
     * @param args
     */
    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String convert = converter.convert("Java");
        System.out.println(convert);
    }

}
