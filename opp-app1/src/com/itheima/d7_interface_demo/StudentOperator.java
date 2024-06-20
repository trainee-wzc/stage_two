package com.itheima.d7_interface_demo;

import java.util.ArrayList;

public interface StudentOperator {
    // 接口中变量和方法 默认的修饰符为 public static
    void printAllInfo(ArrayList<Student> students);
    void printScore(ArrayList<Student> students);

}
