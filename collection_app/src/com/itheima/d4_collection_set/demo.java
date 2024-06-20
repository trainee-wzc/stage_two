package com.itheima.d4_collection_set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        // 需求：找到集合中带有“李”的名字，并从集合中删除

        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱华");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        list.add("王老五");
        list.add("万紫超0.0");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("李")){
                // 不能使用list.remove()方法，因为在迭代的同时不能进行集合的删除操作
                // list.remove(s); // 删除指定元素
                it.remove(); // 删除当前位置的元素，请注意使用的是迭代器对象的remove方法，
                // 并且每删除一次，底层会自动地进行i--的操作

            }
        }
        // 使用增强for循环和lambda表达式都无法解决上面的bug，因为它们都拿不到迭代器对象来调用it.remove()方法
        System.out.println(list);

    }
}
