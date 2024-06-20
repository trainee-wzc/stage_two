package com.itheima.p1;

import com.sun.source.tree.IfTree;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) throws Exception {
        // 业务一
        List<Order> orders = new ArrayList<>();
        // Dom4j框架解析xml文件
        // 1.获得saxReader对象
        SAXReader saxReader = new SAXReader();
        // 2.使用saxReader对象把需要解析的XML文件读成一个document对象
        Document document =
                saxReader.read("D:\\Code\\Stage_2\\final-exam\\src\\com\\itheima\\p1\\orders.xml");

        // 3.从文档对象中解析XML文件的全部数据
        Element root = document.getRootElement();
//        System.out.println(root.getName());
//        System.out.println(root.elementText("name"));

        // 获取根元素下的全部一级子元素
        // 解析所有数据
        List<Element> elements = root.elements();
        for (Element element : elements) {
//            System.out.println(element.attribute("id").getName());
            // 获取当前子元素的属性信息
            int id = Integer.valueOf(element.attributeValue("id"));

            // 获取当前元素下的子元素文本值
            String name = element.elementText("name");
            String time = element.elementText("time");
            // 解析一下时间
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime ldt = LocalDateTime.parse(time,dtf);
            double prize = Double.valueOf(element.elementText("double"));
            orders.add(new Order(id,name,ldt,prize));
        }
        System.out.println("----------业务:一----------");
        for (Order order : orders) {
            System.out.println(order);

        }

        // 业务二:找出今天之前的订单，并遍历输出
        LocalDateTime now = LocalDateTime.now();
        List<Order> list2 = orders.stream().filter(o1 -> o1.getTime().isBefore(now)).collect(Collectors.toList());
        System.out.println("----------业务:二----------");
        for (Order order : list2) {
            System.out.println("id :"  + order.getId());
            System.out.println("name :"  + order.getName());
            System.out.println("time :"  + order.getTime());
            System.out.println("prize :"  + order.getPrize());
            System.out.println("--------------------------");
        }

        // 业务三：找出来最贵的订单，并把这个订单的信息打印出来
        System.out.println("----------业务:三----------");
        List<Order> sortedList = orders.stream().sorted(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if ((o1.getPrize() - o2.getPrize()) < 0){
                    return 1;
                } else if ((o1.getPrize() - o2.getPrize()) == 0) {
                    return 0;
                }else {
                    return -1;
                }
            }
        }).collect(Collectors.toList());

        Order o = sortedList.get(0);
        System.out.println("id :"  + o.getId());
        System.out.println("name :"  + o.getName());
        System.out.println("time :"  + o.getTime());
        System.out.println("prize :"  + o.getPrize());
        System.out.println("--------------------------");

        // 业务四：按照价格降序输出每个订单的详情
        System.out.println("----------业务:四----------");
        for (int i = 0; i < sortedList.size(); i++) {
            Order temp = sortedList.get(i);
            System.out.println("id :"  + temp.getId());
            System.out.println("name :"  + temp.getName());
            System.out.println("time :"  + temp.getTime());
            System.out.println("prize :"  + temp.getPrize());
            System.out.println("--------------------------");

        }



    }
}
