package com.itheima.d8_ThreadPoolExecutor;

import java.util.concurrent.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());


    }
}
