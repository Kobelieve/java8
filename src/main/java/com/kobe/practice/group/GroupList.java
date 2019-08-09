package com.kobe.practice.group;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupList {

    public static void main(String[] args) {

        SkuVo skuVo1 = new SkuVo(1L, "测试商品1", new BigDecimal("100"));
        SkuVo skuVo2 = new SkuVo(1L, "测试商品2", new BigDecimal("200"));
        SkuVo skuVo3 = new SkuVo(3L, "测试商品3", new BigDecimal("300"));
        SkuVo skuVo4 = new SkuVo(3L, "测试商品4", new BigDecimal("100"));
        SkuVo skuVo5 = new SkuVo(1L, "测试商品5", new BigDecimal("100"));
        List<SkuVo> skuVos = Lists.newArrayList(skuVo1, skuVo2, skuVo3, skuVo4, skuVo5);

        Map<Long, List<SkuVo>> map = skuVos.stream().collect(Collectors.groupingBy(SkuVo::getSkuId));
        for (Long skuId : map.keySet()) {
            System.out.println("skuId: " + skuId + "," + map.get(skuId));
            handleSameUnitPrice(map.get(skuId));
        }

        /*Map<BigDecimal, List<String>> collects = skuVos.stream().collect(Collectors.groupingBy(SkuVo::getUnitPrice,
                Collectors.mapping(SkuVo::getSkuName, Collectors.toList())));

        for (BigDecimal unitPrice : collects.keySet()) {
            System.out.println(unitPrice + ", " + collects.get(unitPrice));
        }*/


    }

    private static void handleSameUnitPrice(List<SkuVo> skuVos) {

        Map<BigDecimal, List<SkuVo>> listMap = skuVos.stream().collect(Collectors.groupingBy(SkuVo::getUnitPrice));
        for (BigDecimal unitPrice : listMap.keySet()) {
            System.out.println("unitPrice: " + unitPrice + "," + listMap.get(unitPrice));
        }

    }

}
