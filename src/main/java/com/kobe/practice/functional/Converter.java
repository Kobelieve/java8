package com.kobe.practice.functional;

/**
 * @ClassName FunctionalInter
 * @Description 被此注释修饰的接口只能有一个抽象方法
 * @Author Tao
 * @Date 2019-04-30 17:31
 * @Version 1.0
 */
@FunctionalInterface
public interface Converter<F, T> {

    /**
     * 将数字字符串转化为整数类型
     * @param from
     * @return
     */
    T convert(F from);

}
