package com.kobe.practice.optional;

import java.util.Date;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("kobe");
        System.out.println(name.get());

        System.out.println(name.isPresent());

        System.out.println(name.orElse("james"));

        System.out.println(name.orElseGet(() -> "james"));

        System.out.println(name.orElseThrow(() -> new RuntimeException()));

        Optional<String> name1 = Optional.ofNullable(null);
        System.out.println("---------------------------------------------");
        System.out.println(name1.isPresent());

        System.out.println(name1.orElse("zhangsan"));

        System.out.println(name1.orElseGet(() -> new Date().toString()));

        System.out.println(name1.orElseThrow(() -> new RuntimeException("空指针")));
    }

}
