package com.itheima.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("------Server startup------");
        // 1.创建一个服务端对象，这里调用的是datagramSocket的有参构造器，需要指明端口
        DatagramSocket socket = new DatagramSocket(6666);

        // 2.创建一个数据包对象，用于接收数据
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet =  new DatagramPacket(buffer,buffer.length);

        while (true) {
            // 3.正式开始用数据包来接收客户端发来的数据
            socket.receive(packet);

            // 4.从字节数组中，把接收到的数据直接打印出来
            // 接收到了多少数据就倒出来多少数据
            int length = packet.getLength();
            String rs = new String(buffer,0,length);
            System.out.println(rs);

            // getAddress返回的是客户端的ip对象
            System.out.println(packet.getAddress().getHostName());
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());

            System.out.println("-------------------------------");

        }
//        // 释放资源
//        socket.close();  // 服务端一般都是不关的

    }
}
