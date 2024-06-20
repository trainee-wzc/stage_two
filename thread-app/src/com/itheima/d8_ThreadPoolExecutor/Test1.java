package com.itheima.d8_ThreadPoolExecutor;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        // AbortPolicy是默认的策略


        // 对于Runnable 任务对象，线程池调用的是execute这个方法
        Runnable target = new MyRunnable();
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); // 复用了前面的核心线程
        pool.execute(target); // 复用了前面的核心线程
        pool.execute(target); // 复用了前面的核心线程
        pool.execute(target); // 复用了前面的核心线程
        // 临时线程创建的时机 :  核心线程全部被占用&&任务队列已满
        // 下面的两行代码都创建了临时线程
        pool.execute(target); // 复用了前面的核心线程
        pool.execute(target); // 复用了前面的核心线程

        // 如果核心线程和临时线程都被占用，并且队列也已经满了，这时候怎么办？？？
        // 那么这时候就需要拒绝新的任务了，然后会抛出异常
        pool.execute(target);

        // 如果改变策略为CallerRunPolicy,则由老板亲自服务
        /*pool-1-thread-1===> 输出666~~~~
        main===> 输出666~~~~
        pool-1-thread-3===> 输出666~~~~
        pool-1-thread-5===> 输出666~~~~
        pool-1-thread-2===> 输出666~~~~
        pool-1-thread-4===> 输出666~~~~
        */

//        pool.shutdown(); // 等任务执行完毕，再关闭线程池
//        pool.shutdownNow(); // 立即关闭线程池，不管任务是否执行完毕



    }
}
