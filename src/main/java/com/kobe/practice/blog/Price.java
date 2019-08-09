package com.kobe.practice.blog;

import java.math.BigDecimal;

public class Price {

    private BigDecimal mallPrice;

    private BigDecimal costPrice;

    public BigDecimal getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(BigDecimal mallPrice) {
        this.mallPrice = mallPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }
}
