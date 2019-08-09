package com.kobe.practice.optional;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

        Integer price = getPrice();

        System.out.println(validatePrice(price));
        
        validatePriceOld(price);

    }

    private static Integer validatePriceOld(Integer price) {

        if (price != null) {
            if (price > 9) {
                return price;
            }
        }

        throw new IllegalArgumentException("价格不符合规则");
    }

    private static Integer validatePrice(Integer price) {
        return Optional.ofNullable(price)
                .filter(val -> val > 9)
                .orElseThrow(() -> new IllegalArgumentException("价格不符合规则"));
    }

    private static Integer getPrice() {
        return null;
    }

}
