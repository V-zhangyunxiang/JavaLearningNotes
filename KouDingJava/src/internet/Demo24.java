<<<<<<< HEAD
package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo24 {
//ʹ��udpЭ�������������
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket(22222);
		while(true){
			byte []b=new byte[1024];
			DatagramPacket packet=new DatagramPacket(b,b.length);
			socket.receive(packet);
			String content=new String(packet.getData(), 0, packet.getLength());
			String ip=packet.getAddress().getHostAddress();
			System.out.println("ip:"+ip+";"+"����Ϊ:"+content);
		}
	     //socket.close();//��Զ����ִ�еĴ���

	}

}
=======
package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo24 {
//ʹ��udpЭ�������������
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket(22222);
		while(true){
			byte []b=new byte[1024];
			DatagramPacket packet=new DatagramPacket(b,b.length);
			socket.receive(packet);
			String content=new String(packet.getData(), 0, packet.getLength());
			String ip=packet.getAddress().getHostAddress();
			System.out.println("ip:"+ip+";"+"����Ϊ:"+content);
		}
	     //socket.close();//��Զ����ִ�еĴ���

	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
