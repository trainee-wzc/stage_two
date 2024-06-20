package com.itheima.d7_interface_demo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.SortedMap;

public class StudentOperatorImpl2 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("----------全班全部学生的信息如下----------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名："+s.getName()+"，性别："+s.getSex()+"，成绩："+s.getScore());

        }
        System.out.println("-------------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
        double sum = 0;

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            sum += s.getScore();

        }
        double avg = sum / students.size();
        System.out.println("全班学生的平均成绩为："+avg);
    }


}
