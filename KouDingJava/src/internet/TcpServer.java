package internet;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		//����Socket�˵�,ͬʱ�����˿�
		System.out.println("�����������������");
		ServerSocket server=new ServerSocket(13333);
		//�õ��ͻ���ʹ�õ�Socket��,���Socket�����ǿͻ��˶���
        //��֤�������˺Ϳͻ���ʹ��ͬһ��Socket��
		Socket s=server.accept();
		
		//��������--
		InputStream in=s.getInputStream();
		//��ȡ����
		byte []arr=new byte[1024];
		int len=in.read(arr);
		System.out.println(new String(arr, 0, len));
		s.close();
		
		
	}

}

