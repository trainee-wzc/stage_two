package com.itheima.p2;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.*;

// 掌握stream流的用法
public class Test {
    // 创建一个list保存所有用户信息
    public static List<People> people = new ArrayList<>();
    public static void main(String[] args) {


        // 将每个人的信息封装起来
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"农家乐","野外拓展");
        people.add(new People("张全蛋儿",list1));


        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"轰趴","野外拓展","健身房");
        people.add(new People("李二狗子",list2));


        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"野外拓展");
        people.add(new People("翠花",list3));


        List<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"轰趴","健身房");
        people.add(new People("小帅",list4));


        List<String> list5 = new ArrayList<>();
        Collections.addAll(list5,"农家乐");
        people.add(new People("有容",list5));

        // 功能点
        function1();

    }

    public static void function1(){
        List<String> temp = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>();
        for (People person : people) {
            for (String s : person.getLocation()) {
                if(!map1.containsKey(s)){
                    map1.put(s,1);
                }else{
                    map1.put(s,map1.get(s) + 1);
                }
            }
        }
        // 极致的stream流。map如要使用stream流，就要先得到它的entry对象，用entrySet方法
        System.out.println(map1);
        Map.Entry<String, Integer> entry = map1.entrySet().stream().max((e1, e2) -> e1.getValue() - e2.getValue()).get();
        System.out.println("选择人数最多的地方:");
        map1.entrySet().stream().filter(e -> e.getValue() == entry.getValue()).
                forEach(e -> System.out.println(e.getKey() + " ===> " + e.getValue()));

        // 打印输出哪些人没有去野外拓展
        System.out.println("没有去" + entry.getKey() + "的人有:");
        people.stream().filter(e -> !e.getLocation().contains(entry.getKey())).forEach(e -> System.out.println(e.getName()));

    }

}
