<<<<<<< HEAD
package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo22 {
/*ʹ��Udpʵ�����ݵĽ���
 * 1.����Socket�˵�
 * 2.����һ���յ����ݱ�������������
 * 3.ʹ��Socket�Ľ��չ��ܽ�������
 * 4.��ȡ���յ�������
 */
	public static void main(String[] args) throws IOException {
		//1.����Socket�˵�
		DatagramSocket socket=new DatagramSocket(11111); //���շ�����������ͷ��Ķ˿ڣ������յ�����
		//2.����һ���յ����ݱ�������������
           byte []arr=new byte[1024];
           DatagramPacket packet=new DatagramPacket(arr, arr.length);
           //3.ʹ��Socket�Ľ��չ��ܽ�������
           socket.receive(packet);
           //��ȡ���յ�������
           byte []data=packet.getData();
           //�ֽ����������ַ���
           String content=new String(data, 0, packet.getLength());
           //��ȡ�������ݵ�����ip
           InetAddress address=packet.getAddress();
           String ip=address.getHostAddress();   //ip��adressǰ�����һ��/
           //�õ����ͷ�ʹ�õĶ˿ں�
           int port=packet.getPort();
           
           System.out.println("ip:"+ip+";"+"port:"+port+";"+"����Ϊ:"+content+";"+"adress:"+address);
           socket.close();
           //�����н��շ��������з��ͷ�
	}

}
=======
package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo22 {
/*ʹ��Udpʵ�����ݵĽ���
 * 1.����Socket�˵�
 * 2.����һ���յ����ݱ�������������
 * 3.ʹ��Socket�Ľ��չ��ܽ�������
 * 4.��ȡ���յ�������
 */
	public static void main(String[] args) throws IOException {
		//1.����Socket�˵�
		DatagramSocket socket=new DatagramSocket(11111); //���շ�����������ͷ��Ķ˿ڣ������յ�����
		//2.����һ���յ����ݱ�������������
           byte []arr=new byte[1024];
           DatagramPacket packet=new DatagramPacket(arr, arr.length);
           //3.ʹ��Socket�Ľ��չ��ܽ�������
           socket.receive(packet);
           //��ȡ���յ�������
           byte []data=packet.getData();
           //�ֽ����������ַ���
           String content=new String(data, 0, packet.getLength());
           //��ȡ�������ݵ�����ip
           InetAddress address=packet.getAddress();
           String ip=address.getHostAddress();   //ip��adressǰ�����һ��/
           //�õ����ͷ�ʹ�õĶ˿ں�
           int port=packet.getPort();
           
           System.out.println("ip:"+ip+";"+"port:"+port+";"+"����Ϊ:"+content+";"+"adress:"+address);
           socket.close();
           //�����н��շ��������з��ͷ�
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
