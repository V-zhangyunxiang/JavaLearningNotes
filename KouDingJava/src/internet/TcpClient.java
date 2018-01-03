<<<<<<< HEAD
package internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
	//1.创建Socket客户端对象
	//创建一个客户端对象,同时指明连接的服务器IP地址和端口号
	//和服务器连接成功,相当于和服务器端建立了一条通道
	//这条通道就是Socket流，也就是客户端对象，Socket流中既有字节输入流，也有字节输出流
		System.out.println("客户端启动。。。。");
		Socket socket=new Socket(InetAddress.getByName("192.168.1.103"),13333);
		//向服务器端发送数据--使用输出流
		OutputStream out=socket.getOutputStream();
		//使用输出流向服务器端写入数据
		out.write("您好".getBytes());
		socket.close();

	}

}
=======
package internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
	//1.创建Socket客户端对象
	//创建一个客户端对象,同时指明连接的服务器IP地址和端口号
	//和服务器连接成功,相当于和服务器端建立了一条通道
	//这条通道就是Socket流，也就是客户端对象，Socket流中既有字节输入流，也有字节输出流
		System.out.println("客户端启动。。。。");
		Socket socket=new Socket(InetAddress.getByName("192.168.1.103"),13333);
		//向服务器端发送数据--使用输出流
		OutputStream out=socket.getOutputStream();
		//使用输出流向服务器端写入数据
		out.write("您好".getBytes());
		socket.close();

	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
