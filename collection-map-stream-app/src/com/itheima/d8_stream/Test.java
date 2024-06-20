package com.itheima.d8_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        Collections.addAll(list,88.5,100.0,60.0,99.0,9.5,99.6,25.0);
        list.stream().filter(score -> score >= 60.0).sorted()
                .forEach(score -> System.out.println(score));
        // foreach不是中间方法，相当于终结方法
        // 中间方法是值在调用后重新生成一个stream流，支持链式编程
    }
}
