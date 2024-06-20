//package com.itheima.d3_Logback;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class Test {
//    // 不要导错了包，这个是lf4j那个包里的logger，创建一个Logger日志对象
//    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");
//
//    public static void main(String[] args) {
//        // 需求：使用Logback日志框架，记录系统的运行信息
//
//        // ------实现步骤------
//        // 1.导入Logback框架到项目里（也就是添加到lib文件夹下）
//        // 2.将Logback框架的核心配置文件logback.xml直接拷贝到src目录下（必须是src）
//        // 3.创建logback框架提供的logger对象，然后用logger对象调用其提供的方法就可以记录系统的日志信息
//
//        try {
//            // 正常来说是用info来记录
//            LOGGER.info("------divide方法开始执行------");
//            divide(10,0);
//            LOGGER.info("------divide方法执行成功------");
//        } catch (Exception e) {
////            e.printStackTrace(); // 不打印一场信息
//            // 运行到这，说明程序捕获了一个异常，就应该用error来记录异常信息
//            LOGGER.error("------divide方法执行失败了哇------");
//
//        }
//
//    }
//
//    private static void divide(int a, int b) {
//        // 推荐使用debug
//        LOGGER.debug("参数a：" + a);
//        LOGGER.debug("参数b：" + b);
//        int c = a / b;
//        System.out.println("结果是：" + c);
//        // 结果比较重要,用info记录
//        LOGGER.info("结果是：" + c);
//    }
//}
