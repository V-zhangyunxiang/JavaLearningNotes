package internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo21 {
/*
 * ʹ��udpЭ��ʵ�����ݵķ���
 * 1.����Socket�˵�
 * 2.��ȷҪ���͵�����
 * 3.��Ҫ���͵����ݷ�װ�����ݱ���
 * 4.ʹ��Socket�ķ��͹��ܷ�������
 *   ���紫����Ҫ��:Э��(������),IP��ַ,�˿ںš�
 *   �˿ںŵķ�Χ��0��65535���������������ҳ�����80�˿ڣ�����FTP�����21�˿ڵȵ�
 */
	
	public static void main(String[] args) throws IOException {
		//1.����Socket�˵�
		DatagramSocket socket=new DatagramSocket();  //Э��
		//2.��ȷҪ���͵�����
         String ss="����ż�";
         byte[]data=ss.getBytes();
         //3.��Ҫ���͵����ݷ�װ�����ݱ���
         //DatagramPacket(byte[] buf,int length,InetAddress address,int port)
         //ָ����Ҫ���͵�����,���ݵĳ���,�������ݵ�������ַ,��������ʹ�õĶ˿�
         DatagramPacket packet=new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.102"), 11111);
         //4.ʹ��Socket�ķ��͹��ܷ�������
         socket.send(packet);
         socket.close();
         //�ڲ�����IO���Ķ���д��
	}

}

