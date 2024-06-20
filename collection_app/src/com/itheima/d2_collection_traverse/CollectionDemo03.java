package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        // 之前将了while+iterator遍历集合，和增强for循环遍历集合两种方式
        // 这节课的目标是用lambda 表达式来遍历集合

        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小赵");
        c.add("苏苏");
        c.add("灭绝");


        // lambda表达式结合foreach方法实现对集合元素的遍历
        // 匿名内部类实现Consumer接口
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        c.forEach(s -> System.out.println(s)) ;
        // 实例方法的引用 对象名::实例方法
        c.forEach(System.out::println);


    }
}
