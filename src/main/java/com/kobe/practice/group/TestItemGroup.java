package com.kobe.practice.group;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 按对象属性分组
 */
public class TestItemGroup {

    public static void main(String[] args) {
        ItemVO itemVO1 = new ItemVO(1L, "珠海", "KOBE", "www.baidu1.com");
        ItemVO itemVO2 = new ItemVO(2L, "珠海", "KOBE", "www.tlowk2.com");
        ItemVO itemVO3 = new ItemVO(3L, "广州", "KOBE", "www.baidu3.com");
        ItemVO itemVO4 = new ItemVO(4L, "深圳", "KOBE", "www.baidu4.com");
        ItemVO itemVO5 = new ItemVO(5L, "广州", "KOBE", "www.baidu5.com");
        List<ItemVO> itemVOS = Lists.newArrayList(itemVO1, itemVO2, itemVO3, itemVO4, itemVO5);

        Map<Integer, List<ItemVO>> map = Maps.newHashMap();

        for (int i = 0; i < itemVOS.size(); i++) {
            ItemVO itemVO = itemVOS.get(i);
            boolean flag = false;
            for (Integer num : map.keySet()) {
                List<ItemVO> voList = map.get(num);
                boolean contains = voList.contains(itemVO);
                if (contains) {
                    voList.add(itemVO);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                int size = map.size();
                map.put(size, Lists.newArrayList(itemVO));
            }

        }

        map.forEach((k, v) -> {
            System.out.println(k + ":" + map.get(k));
        });

    }

}
