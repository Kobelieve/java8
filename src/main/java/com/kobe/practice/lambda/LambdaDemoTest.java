package com.kobe.practice.lambda;

import org.junit.After;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName LambdaDemo
 * @Description LambdaDemoTest
 * @Author Tao
 * @Date 2019-04-30 16:46
 * @Version 1.0
 */
public class LambdaDemoTest {

    private static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    @Test
    public void testOldCompare() {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

    @Test
    public void testNewCompare() {
        Collections.sort(names, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });
    }

    @Test
    public void testShort() {
        Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));
    }

    @Test
    public void testShoter() {
        names.sort((o1, o2) -> o1.compareTo(o2));
    }

    @After
    public void afterProcess() {
        for (String name : names) {
            System.out.println(name);
        }
    }


}
