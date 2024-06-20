package com.itheima.d3_tcp;

import java.io.*;

import java.net.Socket;


public class ServerReaderThread extends Thread{
    private Socket socket;
    // 写一个有参数构造器来接收管道数据
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 得到输入管道的字节输入流
            InputStream is = socket.getInputStream();

            // 包装成数据输入流
            DataInputStream dis = new DataInputStream(is);

            while(true){
                try {
                    String rec = dis.readUTF();
                    System.out.println(rec);
                    // 把这个消息发送给全部客户端接收
                    sendMsgToAll(rec);
                    // 打印ip地址
                    System.out.println(socket.getRemoteSocketAddress());
                    System.out.println("------------------------------------");
                } catch (Exception e) {
                    System.out.println(socket.getRemoteSocketAddress() + " 用户下机了！");
                    TcpServer.onlineSockets.remove(socket);
                    System.out.println("------------------------------------");
                    dis.close();
                    socket.close();
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    // 实现群聊
    private void sendMsgToAll(String rec) throws Exception {
        for (Socket onlineSocket : TcpServer.onlineSockets) {
            OutputStream os = onlineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(rec);
            dos.flush();


        }
    }
}
