package Test3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        // 一.请你开发一个程序，当小花输入年以及月后，立即显示出该月份的休息日详情

        // 1.输入年月
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] date = time.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);

        // 2.获得列表信息
        List<String> list = search(year, month);

        // 3.遍历当前月份休息信息
//        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }

        // 2.
    }

    public static List<String> search(int year, int month){
        // 拦截不合法情况
        if(year <= 2022 && month <= 2){
            System.out.println("你查询的信息不合法~~");
            return null;
        }

        // 创建一个列表存储休息信息
        List<String> info = new ArrayList<>();

        // 创建localDate对象
        LocalDate start = LocalDate.of(2022, 2, 3);
        LocalDate date= LocalDate.of(year, month, 1);

        int betweenDays = (int) ChronoUnit.DAYS.between(start, date);

        int days = date.lengthOfMonth();

        // 遍历当前月份的天数
        for (int i = 0; i < days; i++) {
            if((betweenDays) % 3 == 0){
                // 判断这个休息日是不是周六或者周日
                if(date.getDayOfWeek().toString().equals("SATURDAY")){
                    info.add(date + "[休息]" + " 周六");
                }else if(date.getDayOfWeek().toString().equals("SUNDAY")){
                    info.add(date + "[休息]" + " 周日");
                }else{
                    info.add(date + "[休息]");
                }
            }else {
                info.add(date.toString());
            }
            date = date.plusDays(1);
            betweenDays++;
        }

        return info;
    }

}
