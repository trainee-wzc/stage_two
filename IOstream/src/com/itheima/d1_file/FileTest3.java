package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个新文件，创建成功返回True；若文件之前已经存在，则不会创建，并返回False
        File f1 = new File("");
        System.out.println(f1.createNewFile());

        // 2.用于创建文件夹 public boolean mkdir() 注意：只能创建一级文件夹
        File f2 = new File("");
        System.out.println(f2.mkdir());

        // 3.用于创建文件夹，注意：可以创建多级文件夹
        System.out.println(f2.mkdirs());

        // 4.删除文件，或者空文件，注意：不能删除非空文件夹
        // 删除成功返回True
        System.out.println(f2.delete());

    }
}
