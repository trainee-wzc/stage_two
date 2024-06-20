package com.itheima.d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        // set是一个接口，不能直接new对象，要找它的实现类，比如HashSet
        Set<Integer> set = new HashSet<>(); // 一行经典代码 无序、不重复、无索引
        // Set<Integer> set = new LinkedHashSet<>(); // 一行经典代码 有序、不重复、无索引
        // 和添加元素的顺序相同

        // Set<Integer> set = new TreeSet<>(); // 一行经典代码 排序（默认升序排序)、不重复、无索引
        set.add(777);
        set.add(222);
        set.add(666);
        set.add(773);
        set.add(777);
        set.add(888);
        set.add(234);
        System.out.println(set);
        // 无序的概念：指的是第一次创建出来的时候是无序的，但是后续创建出来时会保持不变

    }
}
