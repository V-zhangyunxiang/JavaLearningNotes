<<<<<<< HEAD
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Demo19 {
	public static void main(String[] args) throws IOException {
		//��׼��������  --����       ��׼������--����̨
		InputStream in=System.in;//�Ѿ��ͼ��̰󶨺õ�һ��InputStream���͵�������
        OutputStream os=System.out;
//      int num=in.read();
//	    System.out.println((char)num);
		
		//ѭ����ȡ������������ݣ���һ��ʱ��ӡ��д��ʽ������һ��ʱ�洢 (window \r\n)
		/*
		int num;
		StringBuilder sb=new StringBuilder();
		while(true){
			num=in.read();
			if(num=='\r')
				continue;
			else if(num=='\n'){
				if("over".equals(sb.toString()))//����overʱ����
					break;
				System.out.println(sb.toString().toUpperCase());
			    sb.delete(0, sb.length());
			}
			else
				sb.append((char)num);
		}
		*/
		
		//��ΰ��ֽ�������ת��Ϊ�ַ�������?
		// ת����:
		// ���ֽ������� -ת��-�ַ�����������:InputStreamReader
		// ���ֽ������ -ת�� -�ַ����������:OutputStreamWriter
        // ת�����ַ�����ʹ��readline,����ת.
		// �ַ������ܱ�ת�����ֽ���,ֱ����getByte����ת����
        
		//System.setIn(new FileInputStream("b.txt"));//�ı��׼������
        //System.setOut(new PrintStream("a.txt"));//�ı��׼�����
		//�Ѽ����������д�뵽�ļ���ȥ
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
	    String line=null;
	    while((line=br.readLine())!=null){
	    	if("over".equals(line))
	    		break;
	    	bw.write(line);
	    	bw.newLine();
	    	bw.flush();
	    }
	    br.close();
	    bw.close();
	}

}
=======
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Demo19 {
	public static void main(String[] args) throws IOException {
		//��׼��������  --����       ��׼������--����̨
		InputStream in=System.in;//�Ѿ��ͼ��̰󶨺õ�һ��InputStream���͵�������
        OutputStream os=System.out;
//      int num=in.read();
//	    System.out.println((char)num);
		
		//ѭ����ȡ������������ݣ���һ��ʱ��ӡ��д��ʽ������һ��ʱ�洢 (window \r\n)
		/*
		int num;
		StringBuilder sb=new StringBuilder();
		while(true){
			num=in.read();
			if(num=='\r')
				continue;
			else if(num=='\n'){
				if("over".equals(sb.toString()))//����overʱ����
					break;
				System.out.println(sb.toString().toUpperCase());
			    sb.delete(0, sb.length());
			}
			else
				sb.append((char)num);
		}
		*/
		
		//��ΰ��ֽ�������ת��Ϊ�ַ�������?
		// ת����:
		// ���ֽ������� -ת��-�ַ�����������:InputStreamReader
		// ���ֽ������ -ת�� -�ַ����������:OutputStreamWriter
        // ת�����ַ�����ʹ��readline,����ת.
		// �ַ������ܱ�ת�����ֽ���,ֱ����getByte����ת����
        
		//System.setIn(new FileInputStream("b.txt"));//�ı��׼������
        //System.setOut(new PrintStream("a.txt"));//�ı��׼�����
		//�Ѽ����������д�뵽�ļ���ȥ
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
	    String line=null;
	    while((line=br.readLine())!=null){
	    	if("over".equals(line))
	    		break;
	    	bw.write(line);
	    	bw.newLine();
	    	bw.flush();
	    }
	    br.close();
	    bw.close();
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
