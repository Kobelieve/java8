package com.kobe.practice.functional;

/**
 * @ClassName PersonFactory
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-25 21:20
 * @Version 1.0
 */
public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}
