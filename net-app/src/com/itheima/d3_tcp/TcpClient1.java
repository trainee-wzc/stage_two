package com.itheima.d3_tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

// tcp协议，3次握手建立连接，4次挥手断开连接
public class TcpClient1 {
    public static void main(String[] args) throws Exception{
        // tcp通信用的是socket,而udp协议用的是datagramSocket
        // 有参构造器，第一个是服务器的ip地址，第二个是服务端的端口号
        // 1.创建socket对象，并同时与服务端程序建立连接
        // 127.0.0.1固定为主机的ip地址
        Socket socket = new Socket("127.0.0.1",8888);

        //  2.从socket通信管道中得到一个字节输出流，用来发数据给服务端程序
        OutputStream os = socket.getOutputStream();

        // 3.把低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------请发送数据！--------");
            String msg = sc.nextLine();
            if ("exit".equals(msg)){
                System.out.println("已成功退出操作系统！");
                // 不再发送数据，就关闭管道，释放资源
                dos.close();
                socket.close();
                break;
            }
            // 4.开始写数据给服务端哇！，这边用的是writeUTF，可以直接写字符串
            dos.writeUTF(msg);
            dos.flush();
        }
//        dos.close();
//
//        socket.close();
    }
}
