package io;


import java.io.FileReader;
import java.io.IOException;

public class Demo13 {

	public static void main(String[] args) throws IOException {
		//���ı��ж�ȡ�ļ�
		//��Ϊ���ı�->�ַ�������Ϊ�Ƕ�ȡ->Reader����Ϊ�ǲ����ļ�->�ò����ļ����ַ�������
		//1.�����ļ���ȡ������ͱ���ȡ���ļ�����
         FileReader fr=new FileReader("b.txt");//�ļ��������
         int num;
         
         //2.1 ��ȡ����  int read()��ȡ�����ַ�������->�ַ����� ����a,num�ͷ���97
         /*
         while((num=fr.read())!=-1){//��ȡ�����һ���ַ����᷵��-1
        	                         //�����ж��Ƿ��ȡ���
        	System.out.print((char)num);
        	 
         }*/
         
         //������ܼ�ln���У��ƻ��ļ���ԭ���Ű棬��֤��ȡ��ԭʼ��
         
         //2.2 ��ȡ����,���ַ����뵽����  int read(char[] f)
         char []arr=new char[2];//2��ʾÿ�ζ�ȡ���뵽�����е��ַ�����
                                //һ��Ϊ1024������1024��������
         while((num=fr.read(arr))!=-1){
        	// System.out.println(num);//num��ʾ��ȡ�ַ��ĸ���
            System.out.print(new String(arr,0,num));//�������д�0��ʼ,�����ٸ�
         }
         //���ֶ�ȡ�������еķ���Ч��Ҫ�ȶ�ȡ�����ַ��ٶȿ�
         fr.close();
         
	}

}

