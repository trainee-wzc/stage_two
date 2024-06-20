package d4_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(90); // 增
//        arrayList.remove(0); // 删
//        arrayList.add(70);
//        arrayList.set(0,60);  // 改
//        arrayList.get(90);  // 查
        ArrayList<String> list = new ArrayList<>(); // 有序，可重复，有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list);
        System.out.println("------------------------------");

        HashSet<String> set = new HashSet<>(); // 无序，不重复，无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);
        // 没有get方法来取元素，因为他没有索引


    }
}
