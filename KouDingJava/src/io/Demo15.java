package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo15 {
	/*
	 * �ַ����Ļ�����:��������Ϊ����߶���д��Ч�ʣ����߱�����д�Ĺ���
	 *            ʹ�û������������߶�����д��
	 * BufferReader
	 * BufferWriter  �����н���Ͽ�������Ч�ʵ�
	 */

	public static void main(String[] args) throws IOException {
		//ʹ�û���ʵ���ļ���д��
         FileWriter fw=new FileWriter("b.txt");
         //fw���û��������Ч��
         BufferedWriter bw=new BufferedWriter(fw);
         for (int i = 0; i < 3; i++) {
			bw.write("abc"+i);
			bw.newLine();//д�뻻�У���ƽ̨��
			bw.flush();
		}
         bw.close();//�رջ��������ǹر��ַ������
         
	}

}

