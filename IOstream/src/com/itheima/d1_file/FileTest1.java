package com.itheima.d1_file;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        // 1.创建一个File对象，指代某个具体的文件或者文件夹
        File f1 = new File("D:\\desktop_D\\demo.txt");
        // 分隔符也可以用下面这种方式表示，File.separator是一个记住的分隔符，由你的操作系统决定
//        File f1 = new File("D:" + File.separator + "desktop_D\\demo.txt");

        System.out.println(f1.getName()); // 打印文件的名字
        System.out.println(f1.length() + "Byte"); // 返回的是文件的字节大小

        // File对象可以指代一个不存在的文件路径
        // 后续可以用它来调用方法创建文件

        // 相对路径
        File f4 = new File("Algorithm\\src\\BinarySearch.java");
        System.out.println(f4.length());

    }
}
