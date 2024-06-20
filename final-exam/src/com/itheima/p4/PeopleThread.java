package com.itheima.p4;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PeopleThread extends Thread{
    private List<Integer> redEnvelop;
    private int totalMoney;
    public PeopleThread(List<Integer> redEnvelop, String name) {
        super(name);
        this.redEnvelop = redEnvelop;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public void run() {
        // 开始抢钱
        Random r = new Random();
        String name = Thread.currentThread().getName();
        while (true){
            synchronized (this.redEnvelop){
                if(redEnvelop.size() == 0){
                    break;
                }
                int money = redEnvelop.remove(r.nextInt(redEnvelop.size()));
                try {
                    Thread.sleep(10);
                    System.out.println(name + "抢到了红包： " + money + "元");
                    totalMoney += money;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
