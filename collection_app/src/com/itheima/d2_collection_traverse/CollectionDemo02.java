package com.itheima.d2_collection_traverse;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        // 之前讲了用iterator来遍历集合中的元素，现在是第二种方法：增强for循环

        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小赵");
        c.add("苏苏");
        c.add("灭绝");

        System.out.println(c);

        // 格式
        // for(元素的数据类型 变量名 : 数组或者集合){}
        for(String ele :c){
            System.out.println(ele);
        }

    }
}
