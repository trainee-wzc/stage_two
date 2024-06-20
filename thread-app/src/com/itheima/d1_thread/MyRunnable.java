package com.itheima.d1_thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程输出了：" + i);
        }
    }
}
