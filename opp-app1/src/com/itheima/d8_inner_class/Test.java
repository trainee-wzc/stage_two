package com.itheima.d8_inner_class;

public class Test {
    public static void main(String[] args) {
         go(new Sing() {
             @Override
             public void sing() {
                 System.out.println("小猫喵喵喵地叫~~~~");
             }
         });

    }
    public static void go (Sing sing){
        System.out.println("开始了");
        sing.sing();
    }

}

interface Sing {
    void sing();
}
