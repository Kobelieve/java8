package com.kobe.practice.blog;

import java.math.BigDecimal;
import java.util.Optional;

public class Demo1 {

    public static void main(String[] args) throws Exception {
        SkuVo skuVo = new SkuVo();
        Price price = new Price();
//        price.setMallPrice(new BigDecimal(123));
        skuVo.setPrice(price);
        System.out.println(getMallPriceNew(skuVo));
        System.out.println(getMallPriceOld(skuVo));
    }

    public static SkuVo getSkuOld(SkuVo skuVo) {
        if (skuVo != null) {
            Long skuId = skuVo.getSkuId();
            if (skuId.longValue() == 8L) {
                return skuVo;
            }
            return null;
        } else {
            skuVo = new SkuVo();
            skuVo.setSkuId(8L);
            return skuVo;
        }

    }

    public static SkuVo getSkuNew(SkuVo skuVo) {
        return Optional.ofNullable(skuVo)
                .filter(s -> s.getSkuId().longValue() == 8L)
                .orElseGet(() -> {
                    SkuVo skuVoNew = new SkuVo();
                    skuVoNew.setSkuId(8L);
                    return skuVoNew;
                });
    }

    public static BigDecimal getMallPriceOld(SkuVo skuVo) throws Exception {
        if (skuVo != null) {
            Price price = skuVo.getPrice();
            if (price != null) {
                BigDecimal mallPrice = price.getMallPrice();
                if (mallPrice != null) {
                    return mallPrice;
                }
            }
        }
        throw new Exception("市场价为空");
    }

    public static BigDecimal getMallPriceNew(SkuVo skuVo) throws Exception {
        return Optional.ofNullable(skuVo)
                        .map(s -> s.getPrice())
                        .map(p -> p.getMallPrice())
                        .orElseThrow(() -> new Exception("市场价为空"));
    }

}
