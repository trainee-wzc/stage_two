package com.itheima.d3_transform_stream;


import java.io.*;

// 转换流InputStreamReader
public class InputStreamReaderTest2 {
    public static void main(String[] args) {
        try (
                // 1.得到文件的原始字节流（GBK的字节流形式）
                InputStream is = new FileInputStream("IOstream/csb.txt");
                // 2.把原始字节流按照指定的字符集编码转换成字符输入流
                Reader isr = new InputStreamReader(is,"GBK");
                // 3.把字符输入流包装成缓冲字符输入流
                // 缓冲字符流是尊嘟好用哇，readLine确实符合人类思维
                BufferedReader br = new BufferedReader(isr);
                // 4.创建一个打印输出流
                PrintStream ps = new PrintStream("IOstream/csb.txt")
                ){
            String line;
            while((line = br.readLine())!= null ){
                System.out.println(line);
                // 不让系统再将数据打印到控制台，改变输出的路径到PrintStream指定的路径
                System.setOut(ps);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
