# Java Socket应用---通信是这样练成的  
课程视频地址：https://www.imooc.com/learn/161  
git: https://github.com/xxg3053/JavaSocketBase  

##  第1章 网络基础知识

通行的必备条件  
1. IP地址
2. 协议
3. 端口 0-65535 其中0-1023为系统所保留

TCP/IP协议 5层协议
1. 应用层 http(80) ftp(21) smtp telent(23)
2. 传输层
3. 网络层
4. 数据链路层
5. 物理层

### java提供的网络功能四大类 

1. InetAddress: 用于表识网络的硬件资源
2. URL：统一资源定位符，通过URL可以直接读取或者写入网络上的数据
3. Sockets：使用TCP协议实现的网络通信的Socket相关的类
4. Datagram：使用UPD协议，将数据保存在数据报中，通过网络进行通信

#### InetAdress 和 URL 

URL:统一资源定位符，在java.net包中
使用URL读取网页内容
1. 通过URL对象的openStream()方法可以得到指定资源的输入流
2. 通过输入流可以读取、访问网络上的数据

## 第2章 Java 中网络相关 API 的应用 
![image](http://7xky7l.com1.z0.glb.clouddn.com/QQ20180303-222202@2x.png)


## 第3章 通过 Socket 实现 TCP 编程 

socket通信实现步骤  
1. 创建ServerSocket和Socket
2. 打开连接到Socket的输入/输入流
3. 按照协议对Socket进行读/写操作
4. 关闭输入输出流、关闭socket


## 第4章 通过 Socket 实现 UDP 编程  
服务器端实现：  
1. 创建DatagramSocket，指定端口号
2. 创建DatagramPacket
3. 接收客户端发送的数据信息
4. 读取数据

客户端实现步骤：  
1. 定义发送信息
2. 创建DatagramPacket，包含将要发送的信息
3. 创建DatagramSocket
4. 发送数据

## 第5章 Socket 总结 
socket通信原理
所线程的优先级  
![image](http://7xky7l.com1.z0.glb.clouddn.com/WX20180304-123550@2x.png)   
是否关闭输出流和输入流   
![image](http://7xky7l.com1.z0.glb.clouddn.com/WX20180304-123828@2x.png)    
使用tcp通信传输对象  
![image](http://7xky7l.com1.z0.glb.clouddn.com/WX20180304-124049@2x.png)  


##  第6章 综合练习  