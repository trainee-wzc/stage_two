package com.itheima.d11_StringJoiner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // System
        // 1970.1.1 是C语言的生日
//        long start_time = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(i);
//        }
//        long end_time = System.currentTimeMillis();
//        System.out.println((end_time - start_time) / 1000.0 + "s");


        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory()/1024.0/1024.0);
        System.out.println(r.freeMemory()/1024.0/1024.0/1024.0);

        Thread.sleep(5000);



    }
}
