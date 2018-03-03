package com.kenfo.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.inetaddress
 * @Description: InetAddress类
 * @date 2018/2/20 下午10:25
 */
public class Test01 {

    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress实例
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("计算机名：" + inetAddress.getHostName());
        System.out.println("IP地址：" + inetAddress.getHostAddress());
        byte[] bytes = inetAddress.getAddress();//获得字节数组形式的ip地址
        System.out.println("字节数组形式的IP地址：" + Arrays.toString(bytes));
        System.out.println(inetAddress);//直接输出InetAddress对象

        //根据机器名称获取InetAddress对象实例
        //InetAddress inetAddress1 = InetAddress.getByName("kenfodeMacBook-Pro.local");


    }
}
