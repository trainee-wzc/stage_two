package com.itheima.d1_create_thread;

import java.util.concurrent.Callable;

// 第三种方法
public class MyCallable implements Callable<String> {
    private int n;

    // 提供一个有参构造器
    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println("---子线程执行中---");
            sum += i;
        }
        return String.valueOf(sum);
    }
}
