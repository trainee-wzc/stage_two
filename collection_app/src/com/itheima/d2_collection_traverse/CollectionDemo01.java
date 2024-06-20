package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小赵");
        c.add("苏苏");
        c.add("灭绝");

        Iterator<String> it = c.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next()); // 只有4个元素，但是取了5次，所以会抛出异常

        // 使用循环结合迭代器遍历集合
        // hasNext 的作用是问问当前位置有没有数据
        while(it.hasNext()){
            String ele = it.next(); // next()函数，取出来指针当前位置数据，并将指针移动到下一位
            System.out.println(ele);
        }
        }
    }
