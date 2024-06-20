package com.itheima.p5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static List<Users> users = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        // 创建用户对象


        // 1.创建socket对象，并且与服务端程序请求连接
        Socket socket = new Socket("127.0.0.1",8888);

        // 2.从socket通信管道中得到一个字节输出流，用来发数据给服务端程序
        OutputStream os = socket.getOutputStream();

        // 3.把低级的数据输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您需要办理的业务： ");
            System.out.println("1.登录");
            System.out.println("2.注册");
            String msg = sc.nextLine();
            if(msg.equals("登录")){
                logIn();
            }
            if(msg.equals("注册")){
                signIn();
            }
            if(msg.equals("exit")){
                System.out.println("恭喜您成功退出!");
                dos.close();
                socket.close();
                break;
            }

            dos.writeUTF(msg);
            // 缓冲一下
            dos.flush();
        }
    }

    private static void signIn() {
        Scanner sc = new Scanner(System.in);
        String signName;
        while (true) {
            System.out.println("请输入您想要的用户名：");
            String name = sc.nextLine();
            // 检查用户名是否已被注册
            if(!nameRepeat(name)){
                signName = name;
                break;
            }
        }
        System.out.println("请输入您的密码：");
        String passwords = sc.nextLine();
        System.out.println("注册成功!!!");
        users.add(new Users(signName,passwords));

    }

    private static boolean nameRepeat(String name) {
        List<Users> users = Client.users;
        for (Users user : users) {
            if(user.getLogName().equals(name)){
                System.out.println("对不起，您输入的用户名已被注册!!!");
                System.out.println("---------------------------------");
                return true;
            }

        }
        return false;
    }

    private static void logIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的登录名：");
        String logName = sc.nextLine();

    }
}
