package com.itheima.d1_parameter;

import java.util.Arrays;

public class ParamTest {
    public static void main(String[] args) {
        //
        test();
        test(10);
        test(10,20);
        test(10,12,123,1,31);
        test(new int[]{10,20,30,40});
    }
    // 可变参数的设计方式
    // 一个形参列表中只能有一个可变参数，若有其他参数，则只能放在可变参数前面
    // 如 test(int age,int...nums)
    public static void test(int...nums){
        // nums 可变参数在方法内部，本质就是一个数组
        System.out.println(nums.length);

    }
}
