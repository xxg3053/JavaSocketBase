package com.kenfo.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.url
 * @Description: 使用URL读取页面内容
 * @date 2018/3/3 下午9:19
 */
public class Test03 {

    public static void main(String[] args) {
        //创建一个URL实例
        URL url = null;
        try {
            url = new URL("http://www.baidu.com");
            //通过URL的openStream方法获取URL对象所表示的资源的字节输入流
            InputStream is = url.openStream();
            //将字节输入流转换成字符输入流
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            //为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();//读取一行
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}