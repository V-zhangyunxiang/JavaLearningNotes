<<<<<<< HEAD
package internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
	//1.����Socket�ͻ��˶���
	//����һ���ͻ��˶���,ͬʱָ�����ӵķ�����IP��ַ�Ͷ˿ں�
	//�ͷ��������ӳɹ�,�൱�ںͷ������˽�����һ��ͨ��
	//����ͨ������Socket����Ҳ���ǿͻ��˶���Socket���м����ֽ���������Ҳ���ֽ������
		System.out.println("�ͻ���������������");
		Socket socket=new Socket(InetAddress.getByName("192.168.1.103"),13333);
		//��������˷�������--ʹ�������
		OutputStream out=socket.getOutputStream();
		//ʹ����������������д������
		out.write("����".getBytes());
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
	//1.����Socket�ͻ��˶���
	//����һ���ͻ��˶���,ͬʱָ�����ӵķ�����IP��ַ�Ͷ˿ں�
	//�ͷ��������ӳɹ�,�൱�ںͷ������˽�����һ��ͨ��
	//����ͨ������Socket����Ҳ���ǿͻ��˶���Socket���м����ֽ���������Ҳ���ֽ������
		System.out.println("�ͻ���������������");
		Socket socket=new Socket(InetAddress.getByName("192.168.1.103"),13333);
		//��������˷�������--ʹ�������
		OutputStream out=socket.getOutputStream();
		//ʹ����������������д������
		out.write("����".getBytes());
		socket.close();

	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
