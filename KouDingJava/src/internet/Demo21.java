package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo21 {
/*
 * 使用udp协议实现数据的发送
 * 1.创建Socket端点
 * 2.明确要发送的数据
 * 3.把要发送的数据封装成数据报包
 * 4.使用Socket的发送功能发送数据
 *   网络传输三要素:协议(传输层的),IP地址,端口号。
 *   端口号的范围从0到65535，比如用于浏览网页服务的80端口，用于FTP服务的21端口等等
 */
	
	public static void main(String[] args) throws IOException {
		//1.创建Socket端点
		DatagramSocket socket=new DatagramSocket();  //协议
		//2.明确要发送的数据
         String ss="明天放假";
         byte[]data=ss.getBytes();
         //3.把要发送的数据封装成数据报包
         //DatagramPacket(byte[] buf,int length,InetAddress address,int port)
         //指明了要发送的数据,数据的长度,接收数据的主机地址,接收数据使用的端口
         DatagramPacket packet=new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.102"), 11111);
         //4.使用Socket的发送功能发送数据
         socket.send(packet);
         socket.close();
         //内部还是IO流的读和写入
	}

}

