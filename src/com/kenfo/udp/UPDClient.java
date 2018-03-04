package com.kenfo.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.udp
 * @Description: 客户端
 * @date 2018/3/4 下午12:18
 */
public class UPDClient {
    public static void main(String[] args) throws IOException {
        /**
         * 向服务器发送数据
         */
        //1. 定义服务器地址、端口号、数据
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8800;
        byte[] data = "用户名：admin, 密码：123".getBytes();
        //2. 创建数据报，包含发送的数据信息
        DatagramPacket packet = new DatagramPacket(data, data.length, address
                , port);
        //3. 创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket();
        //4. 向服务器端发送数据
        socket.send(packet);

        /**
         * 接受服务器端响应的数据
         */
        //1. 创建数据报，用于接受服务器端响应数据
        byte[] data2 = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(data2, data2.length);
        //2. 接受服务器响应数据
        socket.receive(packet1);
        //3. 读取数据
        String reply = new String(data2, 0, packet1.getLength());
        System.out.println("我是客户端，服务器端说：" + reply);
        //4.关闭资源
        socket.close();
    }
}
