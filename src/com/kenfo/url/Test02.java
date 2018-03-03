package com.kenfo.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.url
 * @Description: TODO
 * @date 2018/3/3 下午9:07
 */
public class Test02 {

    public static void main(String[] args) {
        //创建一个URL
        try {
            URL imooc = new URL("http://www.imooc.com");
            URL url = new URL(imooc, "/index.html?username=tom");
            System.out.println("协议：" + url.getProtocol());
            System.out.println("主机：" + url.getHost());
            //如果未指定端口，则使用默认端口，此时getport方法返回的是-1
            System.out.println("端口：" + url.getPort());
            System.out.println("文件路径：" + url.getPath());
            System.out.println("文件名：" + url.getFile());
            System.out.println("相对路径：" + url.getRef());
            System.out.println("查询字符串：" + url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
