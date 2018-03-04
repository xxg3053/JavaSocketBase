package com.kenfo.socket;

import java.io.*;
import java.net.Socket;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.socket
 * @Description: 基于TCP协议的Socket通信，实现用户登陆 客户端
 * @date 2018/3/3 下午10:38
 */
public class Client {

    public static void main(String[] args) {

        try {
            //1. 创建客户端socket，指定服务器端地址和端口
            Socket socket = new Socket("localhost", 8888);
            //2. 获取输出流，向服务器端发送登陆信息
            OutputStream os = socket.getOutputStream();//字节输出流
            PrintWriter pw = new PrintWriter(os);//将输出流包转为打印流
            pw.write("用户名：admin， 密码：123");
            pw.flush();
            socket.shutdownOutput();
            //3. 获取输入流，并读取服务器端的响应信息
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;
            while ((info = br.readLine()) != null){
                System.out.println("我是客户端，服务器端说：" + info);
            }
            //4. 关闭资源
            br.close();
            is.close();

            pw.close();
            os.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
