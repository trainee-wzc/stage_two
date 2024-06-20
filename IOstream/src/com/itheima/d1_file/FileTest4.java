package com.itheima.d1_file;

import java.io.File;
import java.util.Arrays;

public class FileTest4 {
    public static void main(String[] args) {
        // 1.遍历文件夹
        File f1 = new File("D:\\yolov7-main");
        // list() ，只能获取当前目录下所有的一级文件夹
        String[] names = f1.list();
        System.out.println(Arrays.toString(names));

        // 2.listFiles()
        // 获取当前目录下所有的“一级文件对象”到一个文件对象数组中
        File[] files = f1.listFiles();

        System.out.println(Arrays.toString(files));

    }
}
