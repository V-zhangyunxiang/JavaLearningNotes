<<<<<<< HEAD
package internet;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		//创建Socket端点,同时监听端口
		System.out.println("服务端启动。。。。");
		ServerSocket server=new ServerSocket(13333);
		//得到客户端使用的Socket流,这个Socket流就是客户端对象
        //保证服务器端和客户端使用同一个Socket流
		Socket s=server.accept();
		
		//接收数据--
		InputStream in=s.getInputStream();
		//读取数据
		byte []arr=new byte[1024];
		int len=in.read(arr);
		System.out.println(new String(arr, 0, len));
		s.close();
		
		
	}

}
=======
package internet;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		//创建Socket端点,同时监听端口
		System.out.println("服务端启动。。。。");
		ServerSocket server=new ServerSocket(13333);
		//得到客户端使用的Socket流,这个Socket流就是客户端对象
        //保证服务器端和客户端使用同一个Socket流
		Socket s=server.accept();
		
		//接收数据--
		InputStream in=s.getInputStream();
		//读取数据
		byte []arr=new byte[1024];
		int len=in.read(arr);
		System.out.println(new String(arr, 0, len));
		s.close();
		
		
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
