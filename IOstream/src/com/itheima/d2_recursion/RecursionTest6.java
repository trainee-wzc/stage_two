package com.itheima.d2_recursion;

import java.io.File;

public class RecursionTest6 {
    // 目标：删除非空的文件夹
    public static void main(String[] args) {
        File dir = new File("demo");
        deleteDir(dir);

    }
    public static void deleteDir(File dir){
        if(dir == null || !dir.exists()){
            return;
        }

        if(dir.isFile()){
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();
        if(files == null){
            return;
        }

        if(files.length == 0){
            dir.delete();
            return;
        }

        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
