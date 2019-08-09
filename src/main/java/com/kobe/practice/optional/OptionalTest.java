package com.kobe.practice.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        String msg = "hello!";
        if (msg != null) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        Optional<String> msgOptional = Optional.ofNullable(msg);
//        msgOptional.map().orElse(System.out.println(4));
    }

}
