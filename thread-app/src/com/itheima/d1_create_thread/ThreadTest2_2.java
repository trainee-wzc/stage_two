package com.itheima.d1_create_thread;

public class ThreadTest2_2 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("子线程1输出：" + i);
                }
            }
        };

        new Thread(runnable).start();

        // 1.简化形式1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("子线程2输出：" + i);
                }
            }
        }).start();

        // 2.简化形式2
        new Thread(() ->  {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.println("子线程3输出：" + i);
                }
        }).start();

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
