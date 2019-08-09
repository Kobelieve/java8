package com.kobe.practice.blog;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalTest {

    private static SkuVo skuVo = new SkuVo();

    @Test
    public void test1() {

//        skuVo.getPrice().getCostPrice();

        if (skuVo != null) {
            Price price = skuVo.getPrice();
            if (price != null) {
                BigDecimal costPrice = price.getCostPrice();
            }
        }
    }

    @Test
    public void test2() {
        Optional<BigDecimal> costPrice =
                Optional.ofNullable(skuVo)
                        .map(s -> s.getPrice())
                        .map(p -> p.getCostPrice());
    }

    @Test
    public void test3() {
        if (skuVo != null) {
            // do something
        }
    }

    @Test
    public void test4() {
        Optional.ofNullable(skuVo)
                .ifPresent(u -> {
                    // do something
                });
    }

    @Test
    public void test5() {
        if (skuVo != null) {
            Long skuId = skuVo.getSkuId();
            if (skuId.longValue() == 888L) {
                System.out.println(888);
            } else {
                skuVo = new SkuVo();
                skuVo.setSkuId(999L);
                System.out.println(999);
            }
        }
    }

    @Test
    public void test6() {
       Optional.ofNullable(skuVo)
                .filter(s -> 888L == s.getSkuId());


    }


}
