package com.itheima.d1_thread;

public class Test {
    public static void main(String[] args) {
        // 1.多线程创建方式一：继承thread
//        Thread t = new MyThread();
        // 2.创建方式二：实现myRunnable接口
//        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("子线程输出了：" + i);
            }
        });
        // start方法会向cpu申请一个线程
        t.start();

        for (int i = 0; i < 4; i++) {
            System.out.println("主线程输出了：" + i);
        }
    }
}
