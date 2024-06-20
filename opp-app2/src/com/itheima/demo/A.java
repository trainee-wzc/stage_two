package com.itheima.demo;

// 单例设计模式之饿汉式单例
// 在拿对象的时候，对象就已经创建好了
public class A {
    // 1.类的构造器私有
    private A(){

    }

    // 2.定义一个类变量记住类的一个对象
    private static A a = new A();

    // 3.定义一个类的方法返回类的对象
    public static A getObject(){
        return a;
    }
}
