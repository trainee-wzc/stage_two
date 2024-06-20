package com.itheima.d1_file;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileTest2 {
    public static void main(String[] args)  {
        File f1 = new File("Algorithm\\src\\BinarySearch.java");
        // 3.判断当前文件对象指代的是否是文件，返回boolean类型
        System.out.println(f1.isFile());

        // 4.判断当前文件对象指代的是否是文件夹
        System.out.println(f1.isDirectory());

        // 5.获取文件的名称
        System.out.println(f1.getName());

        // 6.返回文件的大小，返回字节个数
        System.out.println(f1.length());

        // 7.获取文件的最后修改时间(时间毫秒值)
        long time = f1.lastModified();
        // 将得到的时间毫秒值格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String rs = sdf.format(time);
        System.out.println(rs);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime ldt = LocalDateTime.parse("2023/11/03 21:36:50", dtf);
//        System.out.println(ldt);

        // 8.获取创建文件对象时，使用的路径
        System.out.println(f1.getPath());

        // 9.获取绝对路径
        System.out.println(f1.getAbsolutePath());

    }
}
