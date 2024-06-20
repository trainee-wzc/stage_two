package com.itheima.d3_tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpServer {
    public static List<Socket> onlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        // tcp通信的服务端是用ServerSocket类来实现的
        // 1.创建一个服务端对象
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("------yuanShen Server startup!------");


        while (true) {
            // 2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            onlineSockets.add(socket);
            System.out.println("~~~欢迎" + socket.getRemoteSocketAddress() + "哥哥~~~");

            // 3.把这个客户端交给对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }


    }
}
