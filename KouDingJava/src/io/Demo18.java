package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo18 {

	public static void main(String[] args) throws IOException {
		//ʹ���ֽ���������ļ���д������
		/*
		//1.���ļ���
		FileOutputStream fos=new FileOutputStream("bCopy.txt");
		//2.ת��Ϊ�ֽ�д��
		fos.write("kkk".getBytes());
		fos.close();
		*/
		
		//ʹ���ֽ���������ȡ�ļ�����
//		FileInputStream fis=new FileInputStream("b.txt");
//		int num;
//		while((num=fis.read())!=-1){
//			System.out.print((char)num);
//		}
//      int size=fis.available();//�����ļ����ܴ�С,���1024,���ʺϴ��ļ�
//		byte[] b=new byte[1024];
//		while((num=fis.read(b))!=-1){
//			System.out.print(new String(b,0,num));
//		}
		
        //����һ��ͼƬ
		FileInputStream fis=new FileInputStream("diqiu.jpg");
		FileOutputStream fos=new FileOutputStream("diqiucopy.jpg");
		
		int num1;
		byte []arr = new byte[1024]; 
		while((num1=fis.read(arr))!=-1){
			fos.write(arr, 0, num1);
		}
		fis.close();
		fos.close();
		//�ֽڻ��������ַ���������ͬ����û��readline��newline������ͨ�Ķ�ȡд������һ��
	    //BufferedInputStream
	    //BufferedOutputStream
	}

}

