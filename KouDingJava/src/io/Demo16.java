<<<<<<< HEAD
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo16 {

	public static void main(String[] args) throws IOException {
       //适用缓冲流读取文件
		FileReader fr=new FileReader("b.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		//line=br.readLine();//一次读一行，并返回该字符串表示,结果不包含最后的换行符
        while((line=br.readLine())!=null){
        	System.out.println(line);//要人为的加上ln换行
        }
	}

}
=======
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo16 {

	public static void main(String[] args) throws IOException {
       //适用缓冲流读取文件
		FileReader fr=new FileReader("b.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		//line=br.readLine();//一次读一行，并返回该字符串表示,结果不包含最后的换行符
        while((line=br.readLine())!=null){
        	System.out.println(line);//要人为的加上ln换行
        }
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
