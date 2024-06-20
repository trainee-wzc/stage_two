package com.itheima.d4_map_traverse;

import java.util.HashMap;
import java.util.Map;

public class MapTest3 {
    public static void main(String[] args) {

        Map<String,Double> map3 = new HashMap<>();

        map3.put("蜘蛛精",162.5);
        map3.put("万紫超",180.0);
        map3.put("紫霞",165.8);
        map3.put("至尊宝",169.5);
        map3.put("牛魔王",183.6);


        // 遍历map的第三种方式 : lambda表达式
        // 这种方式特别的简单，只需要用foreach方法，并写上（k，v）用来代表遍历到的键和值即可
        map3.forEach((k,v) -> {
            System.out.println(k + "---->" + v);
        });
    }
}
