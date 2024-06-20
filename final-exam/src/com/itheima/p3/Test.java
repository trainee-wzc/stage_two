package com.itheima.p3;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("final-exam\\src\\com\\itheima\\p3\\sysMenu.txt");
//        char[] buffer = new char[1024];
//        int len;
//        while ((len = reader.read(buffer))!= -1){
//            System.out.println(new String(buffer,0,len));
//        }

        BufferedReader br = new BufferedReader(reader);
        // 记录每一行读取的数据
        List<String> lines = new ArrayList<>();
        String line;
        System.out.println("------------原文档的内容------------");
        while ((line = br.readLine())!= null){
            System.out.println(line);
            lines.add(line);
        }
        System.out.println("----------------------------------");

        // compareTo用来做字符串比较的API
        // 把文本信息重新排序
        lines.sort((o1,o2) -> o1.compareTo(o2));
//        System.out.println(lines);

        Writer wr = new FileWriter("final-exam\\src\\com\\itheima\\p3\\newMenu.txt");
        BufferedWriter bw = new BufferedWriter(wr);
        System.out.println("------------新文档的内容------------");
        for (String s : lines) {
            System.out.println(s);
            bw.write(s);
            bw.newLine();
        }
        // byd,用完了一定要关，不然不会有结果
        // flush刷新流，会将数据刷新到目标文件中；close同样能起到这个作用
//        bw.flush();
        bw.close();
        System.out.println("----------------------------------");

    }
}
