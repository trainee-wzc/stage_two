package com.itheima.d7_thread_communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();

    // 厨师
    public synchronized void put(String s) {
        try {
            String name = Thread.currentThread().getName();
            // 判断是否有包子
            if(list.size() == 0){
                list.add(name + "做的肉包子");
                System.out.println(name + "做了 ： 一个肉包子");
                Thread.sleep(2000);

                // 唤醒别人,等待自己
                // 注意顺序，一定要先唤醒别人
                this.notifyAll();
                this.wait();

            }else{
                // 有包子了，不做了
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 吃货
    public synchronized void eat(String s) {
        try {
            String name = Thread.currentThread().getName();
            if(list.size() != 0 ){
                System.out.println(name + "吃了 ： " + list.get(0));
                list.clear();
                Thread.sleep(2000);

                // 线程执行完了，唤醒别的线程，等待自己
                this.notifyAll();
                this.wait();
            }else{
                this.notifyAll();
                // 等待的意思是进入无限制的等待，只有通过别人唤醒才能运转
                // 但也可以调用它的有参数的方法，wait(3000)的意思也是等待3s后自动唤醒
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
