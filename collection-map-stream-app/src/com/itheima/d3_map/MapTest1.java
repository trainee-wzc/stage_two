package com.itheima.d3_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();  // 同样又是一行经典代码
        map.put("手表",100);
        map.put("手表",220);
        map.put("手坤",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);

        System.out.println(map.size());


    }
}
