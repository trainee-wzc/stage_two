package com.itheima.demo;

// 单例设计模式之懒汉式单例
// 在拿对象的时候，对象才开始创建
public class B {
    // 1.私有化构造器
    private B(){

    }

    // 2.创建类的变量来存储类的一个对象
    private static B b;

    // 3.创建类的方法来获取类的对象
    public static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }

}
