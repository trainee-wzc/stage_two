package com.itheima.d9_test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception {
        List<String> gifts = new ArrayList<>();
        Random r = new Random();
        String[] present = {"口红","包","花","裙","鞋","袜子"};
        for (int i = 1; i <= 100 ; i++) {
            gifts.add(present[r.nextInt(present.length)] + i);

        }
        System.out.println(gifts);

        SendThread xm = new SendThread(gifts, "小明");
        xm.start();
        SendThread xh = new SendThread(gifts, "小红");
        xh.start();

        // 调用join方法，让线程跑完才能进行主线程的任务
        xm.join();
        xm.join();

        System.out.println(xm.getCount());
        System.out.println(xh.getCount());

    }

}
