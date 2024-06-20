package com.itheima.d2_recursion;

import java.io.File;
import java.util.Arrays;

public class RecursionTest5 {
    public static void main(String[] args) {
        searchFile(new File("F:/"),"QQ.exe");
    }

    public static void searchFile(File dir,String filename){
        // 1.把非法的情况拦截住
        if(dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        // 2.获取当前目录下的全部一级文件对象
        File[] files = dir.listFiles();
        // 用一个变量来计数

        // 3.判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if(files != null && files.length > 0){
            for (File file : files) {
                if(file.isFile()){
                    if(file.getName().contains(filename)){
                        System.out.println("找到了：" + file.getAbsoluteFile());
                    }
                }else {
                    // 找到的又是文件夹，这时候就要使用递归的方法
                    // 重新调用searchFile方法
                    searchFile(file, filename);
                }
            }
        }

    }

}


