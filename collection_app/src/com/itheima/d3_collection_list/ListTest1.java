package com.itheima.d3_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 一行经典的代码（多态写法），开发中用的最多的

        // 要获取集合的元素需要使用get方法，而不是list[]

        // (1)因为list对象有索引，所以可以通过for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // (2)若要使用迭代器，需先创建一个迭代器对象
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // （3)增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        // (4)lambda 表达式
        list.forEach(s -> System.out.println(s));
        // 或者
        list.forEach(System.out::println);


    }
}
