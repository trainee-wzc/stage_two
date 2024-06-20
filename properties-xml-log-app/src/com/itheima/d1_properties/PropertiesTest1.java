package com.itheima.d1_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("wzc","19");
        properties.setProperty("wx","21");
        properties.setProperty("jh","20");
        // 1.加载properties文件的数据
        properties.load(new FileReader("properties-xml-log-app\\src\\com\\itheima\\d1_properties\\users.properties"));
        System.out.println(properties.getProperty("wzc"));
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "---->" + value);

        }
        System.out.println("------------foreach方法得到键值对信息------------");
        properties.forEach((k,v) -> System.out.println(k + "--->" + v));
        // 2.保存一些数据到properties文件中
        // 这种情况下不用关闭管道，因为他是作为一个参数传递给了store方法，人家会帮你关掉
//        properties.store(new FileWriter("properties-xml-log-app\\src\\com\\itheima\\d1_properties\\users.properties")
//                ,"i saved many users");
//        System.out.println(properties.getProperty("wzc"));
//        System.out.println(properties.getProperty("jh"));
//        properties.

    }
}
