package com.itheima.d2_recursion;

// 猴子吃桃问题，递归的一个经典案例
public class RecursionTest4 {
    public static void main(String[] args) {
        int allPeaches = peaches(10);
        System.out.println(allPeaches);
    }

    public static int peaches(int days){
        if(days == 1){
            return 1;
        }else {
            return ( peaches((days-1)) + 1 ) * 2;
        }
    }
}
