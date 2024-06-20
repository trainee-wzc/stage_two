package com.itheima.d10_StringBuilder;

public class Test {
    // 目标：掌握StringBuild的相关用法
    // 今后推荐使用StringBuild来对字符串进行相关操作
    public static void main(String[] args) {

//        Integer a = 23;
//        String rs = Integer.toString(a);
//        System.out.println(rs);
//
//
//        String ageStr = "29.0";
//        double a1 = Double.valueOf(ageStr);


        StringBuilder str = new StringBuilder("itheima");
        // 支持链式编程
        str.append("wzc").append(666).append("niubi");
        System.out.println(str);
        str.reverse();
        System.out.println(str);

        // 把StringBuilder对象重新转换为string字符串
        String rs = str.toString();
        System.out.println(rs);




    }
}