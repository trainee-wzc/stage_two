package com.itheima.d1_junit;

public class StringUtil {
    public static void printNumber(String name) {
        if(name == null){
            System.out.println(0);
            return ;
        }
        System.out.println("名字的长度是：" + name.length());

    }

    public static int getMaxIndex(String data){
        if(data == null){
            return -1;

        }
        return data.length() - 1;
    }
}
