<<<<<<< HEAD
package io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo14 {

	public static void main(String[] args){
		//����һ��java�ļ�
         //ʹ���ַ���������ȡ�����Ƶ��ļ���ÿ�ζ�ȡ������д�뵽�µ��ļ�
		/*
		FileReader fr=new FileReader("b.txt");
		FileWriter fw=new FileWriter("bCopy.txt");
		int num;
		while((num=fr.read())!=-1){
			fw.write(num);//д�벻��Ҫת����char,ϵͳ���Զ�ת��,��д�뵽�ļ���
		}*/
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw=new FileWriter("b.txt");
			fr=new FileReader("bcopy2.txt");
			char[]arr=new char[1024];
			int num;
			while((num=fr.read(arr))!=-1){
				fw.write(arr,0,num);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			throw new RuntimeException("�ļ�����ʧ��");
		}finally{
			try {
				if(fr!=null)
				fr.close();
				if(fw!=null)
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		
		
	}

}
=======
package io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo14 {

	public static void main(String[] args){
		//����һ��java�ļ�
         //ʹ���ַ���������ȡ�����Ƶ��ļ���ÿ�ζ�ȡ������д�뵽�µ��ļ�
		/*
		FileReader fr=new FileReader("b.txt");
		FileWriter fw=new FileWriter("bCopy.txt");
		int num;
		while((num=fr.read())!=-1){
			fw.write(num);//д�벻��Ҫת����char,ϵͳ���Զ�ת��,��д�뵽�ļ���
		}*/
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw=new FileWriter("b.txt");
			fr=new FileReader("bcopy2.txt");
			char[]arr=new char[1024];
			int num;
			while((num=fr.read(arr))!=-1){
				fw.write(arr,0,num);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			throw new RuntimeException("�ļ�����ʧ��");
		}finally{
			try {
				if(fr!=null)
				fr.close();
				if(fw!=null)
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		
		
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
