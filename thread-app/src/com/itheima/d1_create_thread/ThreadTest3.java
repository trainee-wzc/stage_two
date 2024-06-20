package com.itheima.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 目标：实现Callable方法来进行多线程
* 为什么要用Callable方法呢？
* 因为它能够返回数据，而之前两种方式都是void run，无返回值
* */
public class ThreadTest3 {
    public static void main(String[] args) throws Exception, InterruptedException {
        Callable<String> myCallable = new MyCallable(10);
        // 1.2把callable类型的对象封装成FutureTask（线程任务对象）
        FutureTask<String> ft = new FutureTask<>(myCallable);
        // 未来任务对象的作用？
        // 一、是一个任务对象，实现了Runnable接口
        // 二、在线程执行完毕后，用未来任务对象调用get方法获取线程执行完毕后的结果


        // 2.把线程任务对象交给Thread对象
        Thread thread = new Thread(ft);

        thread.start();

        // 3.获取线程执行完毕后的结果
        /*Attention ； 如果程序执行到这里，但是上面的程序还没有执行完毕，这里的代码会暂停
            等待上面的线程执行完毕才会获取结果*/
        String rs = ft.get();
        System.out.println(rs);



//        // 主线程任务对比
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.println(i);
//        }

    }
}
