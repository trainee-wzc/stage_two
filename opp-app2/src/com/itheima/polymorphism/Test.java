package com.itheima.polymorphism;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
//        People p1 = new People();
//        Student s1 = new Student();
//        p1.run();
////        Student s1 = (Student) p1; // ClassCastException
//        People p2 = s1;
//        System.out.println(p1.getClass());
//
//        // 匿名内部类的写法
//        // 把这个匿名内部类编译成一个子类，然后会立即创建该子类的一个对象
//        Animal a = new Animal() {
//            @Override
//            void cry() {
//                System.out.println("miaomiao~~~");
//            }
//        };
//        a.cry();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(print(arr));

    }

    public static String print(int[] arr){
        if(arr == null){
            return null;

        }

        // 为什么要用stringBuilder，因为在对字符串进行大量的拼接等操作时，它的效率比直接用string更高
        // 代码显得十分繁琐，所以从jdk8开始，采用StringJoiner
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
//        }
//        sb.append("]");
//        return sb.toString();

        StringJoiner sj = new StringJoiner(", ","[", "]");
        for (int i = 0; i < arr.length; i++) {
//            sj.add(String.valueOf(arr[i]));
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }

}

abstract class Animal {
    abstract void cry();
}
