<<<<<<< HEAD
package io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo14 {

	public static void main(String[] args){
		//复制一个java文件
         //使用字符输入流读取被复制的文件，每次读取的数据写入到新的文件
		/*
		FileReader fr=new FileReader("b.txt");
		FileWriter fw=new FileWriter("bCopy.txt");
		int num;
		while((num=fr.read())!=-1){
			fw.write(num);//写入不需要转换成char,系统会自动转换,并写入到文件中
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
			throw new RuntimeException("文件复制失败");
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
		//复制一个java文件
         //使用字符输入流读取被复制的文件，每次读取的数据写入到新的文件
		/*
		FileReader fr=new FileReader("b.txt");
		FileWriter fw=new FileWriter("bCopy.txt");
		int num;
		while((num=fr.read())!=-1){
			fw.write(num);//写入不需要转换成char,系统会自动转换,并写入到文件中
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
			throw new RuntimeException("文件复制失败");
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
