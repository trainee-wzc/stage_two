package d3_exception;

// 掌握处理异常的一种方式： 捕获异常，并尝试修复

import java.util.Scanner;

public class ExceptionTest3 {
    public static void main(String[] args) {
        // 用一个while循环和try catch语句来尝试对异常进行修复
        while (true) {
            try {
                double money = getMoney();
                System.out.println(money);
                break;
            } catch (Exception e) {
                System.out.println("您输入的价格不合法！！！");
            }
        }
    }

    public static double getMoney() throws Exception{
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入合适的价格：");
            // 需要接收double类型的数据，其他类型的输入会引起异常
            // 需要对输入的数据做一定的拦截
            double money = sc.nextDouble();
            if(money >= 0 && money <= 1000){
                return money;
            }else{
                System.out.println("您输入的价格是不合理的！！");
            }
        }
    }
}
