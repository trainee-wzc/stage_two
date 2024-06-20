package com.itheima.d7_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


// 字节流适合做一切文件数据的拷贝，但它不适合做文本内容的输出
// 字符流适合做文本文件的操作

public class FileWriterTest1 {
    public static void main(String[] args) {
        // 字符输出流写出数据后，必须刷新流，或者关闭流，写出去的数据才能生效
        try (
                Writer fw = new FileWriter("");
                ){
            fw.flush(); // 刷新流，
            fw.close(); // 关闭流，包含了刷新流的操作
            // 缓冲区满了的情况下，会自动刷新一次
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
