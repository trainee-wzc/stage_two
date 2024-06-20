package com.itheima.d7_char_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterTest {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("D:/desktop_D/a.txt");
                // 可以添加一个参数来指定字符输出缓冲池的大小
                BufferedWriter bw = new BufferedWriter(fw,8192*2);

            ) {
            bw.write("wzc");
            bw.newLine();
            bw.write("万紫超");
            bw.newLine();
            bw.write("666");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
