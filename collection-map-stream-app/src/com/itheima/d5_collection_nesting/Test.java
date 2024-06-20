package com.itheima.d5_collection_nesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"南京市","赣州市","苏州市","无锡市","常州市");
        map.put("江苏省",list1);

    }
}
