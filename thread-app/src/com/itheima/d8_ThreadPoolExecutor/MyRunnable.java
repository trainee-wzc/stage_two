package com.itheima.d8_ThreadPoolExecutor;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "===> " + "输出666~~~~");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
