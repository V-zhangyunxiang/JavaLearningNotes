package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo16 {

	public static void main(String[] args) throws IOException {
       //���û�������ȡ�ļ�
		FileReader fr=new FileReader("b.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		//line=br.readLine();//һ�ζ�һ�У������ظ��ַ�����ʾ,������������Ļ��з�
        while((line=br.readLine())!=null){
        	System.out.println(line);//Ҫ��Ϊ�ļ���ln����
        }
	}

}
