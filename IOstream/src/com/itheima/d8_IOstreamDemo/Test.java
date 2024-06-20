package com.itheima.d8_IOstreamDemo;



import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 目标：恢复出师表的顺序到新文件中


        try (
                // 1.创建一个字符输入流，并用缓冲字符输入流包装
                Reader fr = new FileReader("IOstream/csb.txt");
                BufferedReader br = new BufferedReader(fr);
                // 2.创建一个字符输出流，并用缓冲字符输出流包装
                Writer fw = new FileWriter("IOstream/csb_new.txt");
                BufferedWriter bw = new BufferedWriter(fw);

                ){

            // 1.定义一个Arraylist集合存储每段内容
            List<String> data = new ArrayList<>();
            // 开始读取数据,每读取一行，存入到ArrayList集合中
            String line;
            while((line = br.readLine()) != null){
                data.add(line);
            }
            // 所有数据都已经存储完毕，接下来就是对ArrayList集合中的数据排序
            // 使用Collections集合进行排序
            Collections.sort(data);
            System.out.println(data);

            // 遍历List集合的每段内容依次写入到新文件中
            for (String text : data) {
                bw.write(text);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
