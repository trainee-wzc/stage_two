package com.itheima.p5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {

        try {
            // 得到字节输入流
            InputStream is = socket.getInputStream();

            // 包装低级的字节输入流
            DataInputStream dis = new DataInputStream(is);

            while (true){
                try {
                    String rs = dis.readUTF();
                    System.out.println(rs);
                    System.out.println(socket.getRemoteSocketAddress());
                    System.out.println("---------------------------------");
                } catch (Exception e) {
                    System.out.println(socket.getRemoteSocketAddress() + "用户离线了");
                    System.out.println("---------------------------------");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
