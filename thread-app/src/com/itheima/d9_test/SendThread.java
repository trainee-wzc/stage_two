package com.itheima.d9_test;

import java.util.List;
import java.util.Random;

public class SendThread extends Thread{
    private List<String> gifts;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public SendThread(List<String> gifts, String name){
        super(name);
        this.gifts = gifts;

    }

    @Override
    public void run() {
        // 加锁的时候一定要思考清除
        // 这里如果写的是this，但是我new了两个线程对象，所以小明和小红都能用
        // 这一把锁，所以还是会引起线程安全问题

        Random r = new Random();
        // byd,把锁放在死循环的外面啊
            while (gifts.size() > 10) {
                synchronized (gifts){
                    String rs = gifts.remove(r.nextInt(gifts.size()));
                    System.out.println(Thread.currentThread().getName() + "派发了礼物" + rs);
                    count++;
//                    Thread.sleep(1000);
//                    this.notifyAll();
//                    this.wait();
            }
        }
    }
}
