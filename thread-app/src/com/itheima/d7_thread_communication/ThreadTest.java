package com.itheima.d7_thread_communication;

public class ThreadTest {
    public static void main(String[] args) {
        // 需求：三个生产者线程，负责生产包子，每个线程每次只能生产一个包子放在桌上
        // 两个消费者线程负责吃包子，每人每次只能从桌子上拿一个包子吃


        Desk desk = new Desk();

        // 创建三个厨师线程
        // 1号厨师
        new Thread(() -> {
            while (true) {
                desk.put("");
            }
        },"厨师1").start();

        // 2号厨师
        new Thread(() -> {
            while (true) {
                desk.put("");
            }
        },"厨师2").start();

        // 3号厨师
        new Thread(() -> {
            while (true) {
                desk.put("");
            }
        },"厨师3").start();


        // 创建两个消费者线程
        // 1号吃货
        new Thread(() -> {
            while (true) {
                desk.eat("");
            }
        },"吃货1").start();

        // 2号吃货
        new Thread(() -> {
            while (true) {
                desk.eat("");
            }
        },"吃货2").start();
    }
}
