package internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("�ͻ�������...");
		Socket socket=new Socket(InetAddress.getByName("192.168.1.103"),14444);
		//��ȡ���������Сд��ĸ
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//�����������Сд��ĸ
	    OutputStream out=socket.getOutputStream();
	   // BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
	    PrintWriter pw=new PrintWriter(out);
	    //���մ�д��ĸ
	    InputStream in=socket.getInputStream();
	    BufferedReader brr=new BufferedReader(new InputStreamReader(in));
	   
		//ѭ����ȡ���������Сд��ĸ
	    String line=null;
	    while((line=br.readLine())!=null){
	    	if("over".equals(line))
	    		break;
	    	//bw.write(line);
	    	pw.println(line);
	    	//���ܴ�д��ĸ
	    	System.out.println(brr.readLine());
	    }
  //br.close();
  socket.close();
  
	}

}
