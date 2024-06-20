package com.itheima.d1_create_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{



    private final Lock lc = new ReentrantLock();



    @Override
    public void run() {
        try {
            lc.lock();
            for (int i = 1; i <=5 ; i++) {
                // t线程也称为子线程，因为它由主线程负责创建
                System.out.println("子线程输出 : " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lc.unlock();
        }

    }
}
