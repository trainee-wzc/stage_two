package com.itheima.d1_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        System.out.println("---------------------------");
        // 根据ip地址或者域名，返回一个inetAddress对象
        InetAddress ip2 = InetAddress.getByName("183.131.147.48");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        // ping www.baidu.com
        System.out.println(ip2.isReachable(6000));



    }
}
