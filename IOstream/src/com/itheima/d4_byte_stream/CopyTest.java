package com.itheima.d4_byte_stream;

import java.io.*;

public class CopyTest {
    public static void main(String[] args)  {
        try (
            // 1.创建一个字节输入流管道与源文件相通
            InputStream is = new FileInputStream("E:/meinv.png");
            BufferedInputStream bis = new BufferedInputStream(is,8192*2);
            // 2.创建一个字节输出管道与目标文件相通3
            OutputStream os = new FileOutputStream("G:/meinv1.png");
            // 请注意：这个括号里只能放置资源对象（流对象）
            // 什么是资源呢？资源都是会实现AutoCloseable接口的
            ){

            // 3.创建一个字符数组，负责转移字节数据
            byte[] buffer = new byte[1024];

            // 4.从字节输入流中读取字节数据，
            int len; // 记录每次读取数据的长度，读多少写多少，不然容易出现异常
            while ((len = is.read(buffer))!= -1) {
                os.write(buffer,0,len);
            }
            // 不用自己关闭流，在try（）里面的语句会自动调用close方法
//            os.close();
//            is.close();
            System.out.println("复制完成~~");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
