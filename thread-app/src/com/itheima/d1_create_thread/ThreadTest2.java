package com.itheima.d1_create_thread;

public class ThreadTest2 {
    // 实现Runnable接口的方式
    public static void main(String[] args) {
        // 3.创建任务对象
        Runnable mr = new MyRunnable();

        // 4.把任务对象交给一个线程对象处理
        Thread p = new Thread(mr);
        p.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
