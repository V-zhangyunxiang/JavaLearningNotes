package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class Demo20 {
//File�����
	public static void main(String[] args) throws IOException {
		//method();
		method2();
	}
	public static void method() throws IOException{
		File file=new File("zyx.txt");
		if(!file.exists())
			file.createNewFile();//�����ļ�                  �ļ�����׺����Ŀ¼���ļ���
		   // file.mkdir();//����Ŀ¼
		   // file.mkdirs();//�������Ŀ¼                  mkdirs�ܴ����༶�ļ���Ŀ¼,mkdirֻ�ܴ���һ��
		sop(file.getName());
		sop(file.getPath());
		sop(file.getParent());//�õ���һ��·��
		sop(file.getAbsolutePath());//�õ�����·��
		sop(file.isFile());
		sop(file.isDirectory());//�Ƿ���һ��Ŀ¼
		sop(file.isHidden());
		sop(new Date(file.lastModified()));//����޸ĵ�ʱ��
	}
	
	public static void method2(){
		File []dir0=File.listRoots();//�г�ϵͳ���е���
		for(File dir:dir0){
			sop(dir);
		}
		File dir1=new File("f:\\");//�г�ָ��Ŀ¼�������ļ����ļ���,���ַ�����ʽ����
		String []arr =dir1.list();
		for(String ss:arr){
			sop(ss);
		}
		File dir2=new File("f:\\ali");//�г�ָ��Ŀ¼�������ļ����ļ���,��File��ʽ����
		File []f=dir2.listFiles();
		for(File aa:f){
			sop(aa);
		}
	}
	//�ݹ�:�Լ������Լ�
	//��Ҫע�������:1:ջ�й��ຯ��,�ڴ����;2:Ҫ�н�������
	//ʹ�û���:�г�f�������ļ������ļ�����Ŀ¼����
	public static void sop(Object obj){
		System.out.println(obj);
	}

}

