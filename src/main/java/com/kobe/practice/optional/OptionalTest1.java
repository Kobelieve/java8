package com.kobe.practice.optional;

import java.util.Optional;

public class OptionalTest1 {

    public static void main(String[] args) {

        Long skuId = 99L;

//        Optional.of(skuId);
        Long result = Optional.ofNullable(skuId)
//                .filter(s -> s > 8L)
                .filter(s -> {
                    return s > 10L;
                })
                .orElseThrow(() -> new IllegalArgumentException("参数错误"));
//                .orElseGet(() -> {
//                   return 32L;
//                });
        System.out.println(result);

    }

}
