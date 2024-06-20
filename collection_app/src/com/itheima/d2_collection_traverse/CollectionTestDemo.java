package com.itheima.d2_collection_traverse;

import java.util.ArrayList;

public class CollectionTestDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asd2");
        arrayList.add("12");
        arrayList.add(123);
        arrayList.add("asd212");
        // add的两个不同构造器，还有一个可以在指定位置插入一个元素
        arrayList.add(0,60);
        System.out.println(arrayList); // [asd2, 12, 123, asd212],自动调用了toString方法
    }
}
