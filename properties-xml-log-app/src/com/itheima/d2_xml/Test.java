//package com.itheima.d2_xml;
//
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;
//
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) throws Exception {
//        // 1.创建一个dom4j框架提供解析器对象
//        SAXReader saxReader = new SAXReader();
//
//        // 2.使用saxReader对象把需要解析的XML文件解读成一个Document对象。
//        Document document = saxReader.read("a.xml");
//
//        // 3.从文档对象中解析XML文件的全部数据
//        Element root = document.getRootElement();
//        System.out.println(root.getName());
//
//        // 4.上一步解析了xml文件的根元素对象，这一步解析它的具体内容，属于核心操作
//        // 获取根元素下的一级子元素
//        List<Element> elements = root.elements("users"); // 重载的方法，可以指定获得一个一级子元素users
//        for (Element element : elements) {
//            System.out.println(element.getName());
//
//        }
//
//        // 5.这里是element而不是elements，只获取一个，
//        // 如果有多个子元素，则默认获取第一个
//        Element user = root.element("users");
//
//    }
//}
