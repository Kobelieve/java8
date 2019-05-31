package com.kobe.practice.predicate;

import org.junit.Test;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @ClassName PredicateDemo
 * @Description TODO
 * @Author Tao
 * @Date 2019-05-26 10:19
 * @Version 1.0
 */
public class PredicateDemo {

    @Test
    public void test() {
        Predicate<String> predicate = (s) -> s.length() > 0;
        boolean kobe = predicate.test("Kobe");
        System.out.println(kobe);
        boolean kobe1 = predicate.negate().test("Kobe");
        System.out.println(kobe1);

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }

}
