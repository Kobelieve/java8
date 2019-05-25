package com.kobe.practice.functional;

/**
 * @ClassName TestFactory
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-25 21:28
 * @Version 1.0
 */
public class TestFactory {

    /**
     * ::引用构造函数
     * @param args
     */
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        personFactory.create("Kobe", "Bryant");
    }

}
