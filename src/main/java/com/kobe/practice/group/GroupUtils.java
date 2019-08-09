package com.kobe.practice.group;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupUtils {

    public static <T> Map<Integer, List<T>> group(List<T> list, Integer sortNum) {

        Map<Integer, List<T>> map = Maps.newHashMap();
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            boolean flag = false;
            for (Integer num : map.keySet()) {
                List<T> voList = map.get(num);
                boolean contains = voList.contains(t);
                if (contains) {
                    voList.add(t);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                if (sortNum == null) {
                    int size = map.size();
                    map.put(size, Lists.newArrayList(t));
                } else {
                    if (map.size() == 0) {
                        map.put(sortNum, Lists.newArrayList(t));
                    } else {
                        Set<Integer> keys = map.keySet();
                        Integer max = Collections.max(keys);
                        map.put(max + 1, Lists.newArrayList(t));
                    }
                }

            }
        }

        return map;
    }

 /*   public static <T> Map<Integer, List<T>> groupByNum(List<T> list, Integer sortNum) {

        Map<Integer, List<T>> map = Maps.newHashMap();
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            boolean flag = false;
            for (Integer num : map.keySet()) {
                List<T> voList = map.get(num);
                boolean contains = voList.contains(t);
                if (contains) {
                    voList.add(t);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                if (map.size() == 0) {
                    map.put(sortNum, Lists.newArrayList(t));
                } else {
                    Set<Integer> keys = map.keySet();
                    Integer max = Collections.max(keys);
                    map.put(max + 1, Lists.newArrayList(t));
                }
            }
        }

        return map;
    }*/

}
