package com.itheima.d7_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    // 接口思想的重要体现
    // 一套接口，后续只要重写接口的方法，即可完成多种不同的方案
    private StudentOperator studentOperator = new StudentOperatorImpl1();

    public ClassManager(){
        students.add(new Student("迪丽热巴",'女',99));
        students.add(new Student("古力娜扎",'女',100));
        students.add(new Student("马尔扎哈",'男',80));
        students.add(new Student("卡尔扎吧",'男',60));

    }

    // 第二套方案打印全班同学的全部信息
    // 打印全班全部学生的信息
    public void printInfo(){
        studentOperator.printAllInfo(students);
    }

    // 打印全班全部学生的平均分
    public void printScore(){
        studentOperator.printScore(students);
    }

}
