package com.kobe.practice.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class SkuVo {

    private Long skuId;

    private String SkuName;

    private BigDecimal unitPrice;

}
