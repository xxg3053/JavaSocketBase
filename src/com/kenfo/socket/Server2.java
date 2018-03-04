package com.kenfo.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.socket
 * @Description: 多线程实现监听
 * @date 2018/3/3 下午11:20
 */
public class Server2 {
    public static void main(String[] args) {

        try {
            //1. 创建一个服务器端Socket，即ServerSocket，指定绑定端口，并监听此端口
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务器端即将启动，等待客户端的连接");
            Socket socket = null;
            //记录客户端的数量
            int count = 0;
            //循环监听等待客户端的连接
            while (true){
                //调用accept()方法开始监听，等待客户端的连接
                socket = serverSocket.accept();
                //创建一个新线程
                ServerThread serverThread = new ServerThread(socket);
                //启动线程
                serverThread.start();

                count++;//统计客户端的数量
                System.out.println("客户端的数量：" + count);
                InetAddress inetAddress = socket.getInetAddress();
                System.out.println("当前客户端的IP：" + inetAddress.getHostAddress());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
