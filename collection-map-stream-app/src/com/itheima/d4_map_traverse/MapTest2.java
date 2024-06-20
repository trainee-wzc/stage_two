package com.itheima.d4_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {

        Map<String , Double> map1 = new HashMap<>();
        map1.put("蜘蛛精",162.5);
        map1.put("黄鼠狼",169.8);
        map1.put("紫霞仙子",165.8);
        map1.put("至尊宝",169.5);
        map1.put("牛魔王",183.6);

        System.out.println(map1);

        Set<String> keys = map1.keySet();
        System.out.println(keys);

        // 遍历Map的第二种方式 : 键值对
        // 调用entrySet方法把map集合转换为键值对类型的set集合
        Set<Map.Entry<String, Double>> entries = map1.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "---->" + value);
        }
    }
}
