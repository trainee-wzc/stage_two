package com.itheima.d1_create_thread;


// 创建多线程方式1：创建一个类 extends Thread，并重写其方法
public class ThreadTest1 {
    // main方法是由一条默认的主线程负责执行
    public static void main(String[] args) {
        Thread t  = new MyThread();
        // 启动线程（自动执行run方法）
        // 1.这里只能写start方法，而不能写run方法
        /*因为如果写run方法，就相当于执行对象重写的run方法而已
        * 程序还是会先执行对象的run方法，再执行main方法后面的代码
        * 就没有起到多线程的作用*/

        // 2.不要把主线程任务放在启动子线程之前
        /*
        * 这个很好理解，因为你还没有启动子线程，
        * 这时候主线程的任务就要先执行完才会启动子线程*/
        t.start(); // main线程 t线程

        for (int i = 1; i <=5 ; i++) {
            System.out.println("主线程Main输出" + i);
        }
    }
}
