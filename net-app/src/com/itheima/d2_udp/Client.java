package com.itheima.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

// udp协议只管发，不管服务端收不收得到
public class Client {
    public static void main(String[] args) throws Exception{
        // 1.创建客户端对象,指明了端口为7777
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        // 2.创建数据包对象封装要发出去的数据
        while (true) {
//            byte[] bytes = "我是快乐的客户端，我发送了图片meinv.jpg".getBytes();
            System.out.println("------请发送数据给服务端------");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("再见！");
                socket.close(); // 释放资源！
                break; //跳出死循环
            }
            byte[] bytes = msg.getBytes();
            // 准备好了一个韭菜盘子
            /*
            * 参数1：封装需要发出去的数据
            * 参数2：发送出去的数据大小
            * 参数3：服务端的IP地址
            * 参数4：服务端程序的端口
            */
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(), 6666);

            // 3.正式开始发送数据包的数据出去
            socket.send(packet);
        }

//        System.out.println("客户端数据发送完毕");


    }
}
