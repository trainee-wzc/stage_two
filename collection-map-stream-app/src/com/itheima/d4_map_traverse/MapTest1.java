package com.itheima.d4_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapTest1 {
    public static void main(String[] args) {

        Map<String,Double> map = new HashMap<>();
        map.put("蜘蛛精",162.5);
        map.put("蜘蛛精",169.8);
        map.put("紫霞",165.8);
        map.put("至尊宝",169.5);
        map.put("牛魔王",183.6);

        System.out.println(map);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 遍历Map的第一种方式 : 键找值
        // 增强for循环遍历出每一个key,然后用get方法得到每一个key对应的value
        for (String key : keys) {
            Double height = map.get(key);
            System.out.println(height);

        }
    }
}
