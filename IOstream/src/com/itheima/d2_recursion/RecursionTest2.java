package com.itheima.d2_recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        int sum = f(4);
        System.out.println(sum);
    }

    public static int f(int num){
        if(num == 1){
            return 1;
        }else{
            return f(num-1) + num;
        }

    }
}
