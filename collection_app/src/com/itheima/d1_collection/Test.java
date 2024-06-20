package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>(); // 多态写法
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        System.out.println(c);
        System.out.println("------------------------------");

        // 清空集合的元素
        c.clear();
        System.out.println(c);
        System.out.println("------------------------------");

        // 判断集合是否为空
        System.out.println(c.isEmpty());
        System.out.println("------------------------------");

        // 获取集合的大小
        System.out.println(c.size());
        System.out.println("------------------------------");

        // 判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));
        System.out.println("------------------------------");

        // 删除某个元素
        System.out.println(c.remove("java1"));
        System.out.println("------------------------------");

        // 把集合转换为数组（根据具体的业务需求）
        Object[] arr = c.toArray();
        System.out.println(arr.toString());
        System.out.println("------------------------------");
    }
}
