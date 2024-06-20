package com.itheima.d7_char_stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest1 {
    public static void main(String[] args) {
        try (
                // new一个字符输入流对象与目标文件建立通道
                Reader fr = new FileReader("D:/desktop_D/a.txt");
                // 创建字符缓冲输入流，来包装原始的输入流，起到提高系统性能的目的
                BufferedReader br = new BufferedReader(fr);
                // 字符缓冲输入流新增的一个功能，按照行读取字符（注意是字符缓冲输入流的方法）
                ) {
            String rs;
            // 字符缓冲输入流的这个readLine方法是真的香
            while((rs = br.readLine()) != null){
                System.out.println(rs);
            }
//            // 读取文本文件的内容，每次读取一个字符
//            int c; // 记录每次读取的字符编号
//            while ((c = fr.read()) != -1){
//                // 注意去掉换行符号
//                System.out.print((char) c);
//            }
            // 每次读取一个字符的形式，性能比较差
            // 3.每次读取多个字符。
            char[] buffer = new char[10];

            int len;
            while((len = fr.read(buffer)) != -1){
                // 转换字符数组时，每次读了多少个，转多少个
                String s = new String(buffer,0,len);
                System.out.print(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
