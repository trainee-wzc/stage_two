package com.itheima.d1_create_thread;

public class LockTest {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

        // 启动子线程
        t1.start();
        t2.start();


        // 主线程任务
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.println("主线程输出 : " + i);
//
//        }
    }
}
