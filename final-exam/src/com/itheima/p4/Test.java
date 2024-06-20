package com.itheima.p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception {
        List<Integer> redEnvelop = money();
        List<PeopleThread> peopleThreads = new ArrayList<>();
        // 创建线程
        for (int i = 1; i <= 100 ; i++) {
            PeopleThread p1 = new PeopleThread(redEnvelop, i + "号员工");
            peopleThreads.add(p1);
            p1.start();
        }
        for (PeopleThread peopleThread : peopleThreads) {
            peopleThread.join();
        }
        System.out.println("--------------------活动结束--------------------");

        // 降序排列
        peopleThreads.stream().sorted((p1,p2) -> p2.getTotalMoney() - p1.getTotalMoney())
                .forEach(p1 -> System.out.println(p1.getName() + "抢到的总金额为 : " + p1.getTotalMoney()));

    }

    public static List<Integer> money(){
        // 模拟产生红包
        List<Integer> redEnvelop = new ArrayList<>();
        Random r = new Random();
        // 小红包
        for (int i = 0; i < 160; i++) {
            redEnvelop.add(r.nextInt(30) + 1);
        }
        // 大红包
        for (int i = 0; i < 40; i++) {
            redEnvelop.add(r.nextInt(70) + 31);
        }

        Collections.shuffle(redEnvelop);
        System.out.println(redEnvelop);

        return redEnvelop;
    }

    
    
}
