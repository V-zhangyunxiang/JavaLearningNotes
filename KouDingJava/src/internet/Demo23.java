<<<<<<< HEAD
package internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo23 {
/*使用udp协议持续发送数据
 * 最大不超过64k
 */
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			byte []data=line.getBytes();
			DatagramPacket packet=new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.103"), 22222);
			socket.send(packet);
			socket.close();
		}

	}

}
=======
package internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo23 {
/*使用udp协议持续发送数据
 * 最大不超过64k
 */
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			byte []data=line.getBytes();
			DatagramPacket packet=new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.103"), 22222);
			socket.send(packet);
			socket.close();
		}

	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
