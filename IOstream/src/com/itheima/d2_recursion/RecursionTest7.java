package com.itheima.d2_recursion;

/*目标：非规律化递归
 * 啤酒问题
 * 一个人有10元钱，一瓶啤酒2元，2个瓶子可以换一瓶酒，4个盖子可以换一瓶酒，
 * 问 喝酒总数 和剩余瓶子数 和剩余盖子数 15 1 3
 *
 * 核心问题解决方式就是 将瓶子和盖子都转换成钱 再去买酒即可*/
public class RecursionTest7 {
    // 这也是一个重点、
    // 定义静态变量，以便于被所有成员方法调用
    public static int totalNum = 0;//喝酒总数
    public static int lastPingziNum = 0;//剩余的瓶子数
    public static int lastGaiziNum = 0;//剩余的盖子数

    public static void main(String[] args) {

        buyBeer(10);
        System.out.println(totalNum);
        System.out.println(lastPingziNum);
        System.out.println(lastGaiziNum);

    }

    public static void buyBeer(int money) {
        //每一轮喝酒的数量
        int num = money/2;
        //累加到总喝酒数
        totalNum+=num;
        //当前的瓶子总数
        int pingZi = num+lastPingziNum;
        //当前的盖子总数
        int gaiZi = num + lastGaiziNum;
        //当前的钱数
        int totalMoney =(pingZi/2)*2+(gaiZi/4)*2;
        //剩余的盖子数
        lastGaiziNum=gaiZi%4;
        //剩余的瓶子数
        lastPingziNum =pingZi%2;
        //如果钱数大于等于2，那么就可以继续买酒
        if(totalMoney>=2){
            buyBeer(totalMoney);
        }
    }
}


