package com.itheima.d7_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator{

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int count1 = 0;
        int count2 = 0;
        System.out.println("----------全班全部学生的信息如下----------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名："+s.getName()+"，性别："+s.getSex()+"，成绩："+s.getScore());
            if(s.getSex() == '男') count1 += 1;
            if(s.getSex() == '女') count2 += 1;
        }
        System.out.println("男生人数为："+count1+"，女生人数为："+count2);
        System.out.println("-------------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
        double sum = 0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            sum += s.getScore();
            if (max < s.getScore()) max = s.getScore();
            if (min > s.getScore()) min = s.getScore();

        }
        System.out.println("最高分为："+max+"，最低分为："+min);
        System.out.println("全班学生的平均成绩为："+ (sum - max - min)/(students.size() - 2));
    }
}
