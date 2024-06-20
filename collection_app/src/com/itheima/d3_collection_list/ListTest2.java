package com.itheima.d3_collection_list;

import java.util.LinkedList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        // LinkedList和Arraylist的区别在于
        // LinkedList是基于双链表实现的，                            而Arraylist是基于数组实现的
        // 特点：增删快，查询慢（但对于首位元素的增删改查也是极快的）         特点：增删慢，查询快


        // LinkedList新增了：很多对首位操作的特有方法
//        LinkedList<String> list = new LinkedList<>();
//        list.add("赵敏");
//        list.add("小赵");
//        list.add("苏苏");
//        list.add("灭绝");
//        System.out.println(list);
//
//        // LinkedList 的一个经典的应用场景就是 “队列”
//        list.addFirst("紫霞");

        // 以下代码段报错的原因为LinkedList实现了Deque接口，才有了addFirst方法
        /*List<String> list1 = new LinkedList<>();
        list1.addFirst();*/
        // list1.addFirst("紫霞");
        LinkedList<String> stack = new LinkedList<>();
        // push 压栈，实际上是换了个马甲，提高了逼格，addFirst方法
        stack.push("第一发子弹");
        stack.push("第二发子弹");
        stack.push("第三发子弹");
        stack.push("第四发子弹");
        System.out.println(stack);
        System.out.println("--------------------------------------------");

        // pop 出栈,每次弹出的是第一个数据，实际上还是调用了removeFirst方法
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
