package internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer2 {

	public static void main(String[] args) throws IOException {
		System.out.println("���������...");
		ServerSocket server=new ServerSocket(14444);
		Socket s=server.accept();
		//����Сд��ĸ
		InputStream in=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		//���ʹ�д��ĸ
		OutputStream out=s.getOutputStream();
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(out));
		 PrintWriter pw=new PrintWriter(out); 
		String line=null;
		while((line=br.readLine())!=null){
			//bw.write(line.toUpperCase());
			pw.println(line.toUpperCase());
		}
		s.close();
//		bw.close();
//		br.close();

	}

}
