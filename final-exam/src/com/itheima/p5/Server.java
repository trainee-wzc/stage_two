package com.itheima.p5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("--------Ys Server Start !--------");

        // 调用accept方法，等待客户端的请求，这里的socket管道就是客户端的socket管道
        while (true) {
            Socket socket = serverSocket.accept();
            new ServerThread(socket).start();
        }


    }
}
