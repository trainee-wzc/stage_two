package com.itheima.d1_thread;

// 直接用继承的方式有一个缺点就是不利于扩展
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("MyThread输出了：" + i);
        }
    }
}
