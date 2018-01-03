<<<<<<< HEAD
package io;


import java.io.FileReader;
import java.io.IOException;

public class Demo13 {

	public static void main(String[] args) throws IOException {
		//从文本中读取文件
		//因为是文本->字符流，因为是读取->Reader，因为是操作文件->用操作文件的字符输入流
		//1.创建文件读取流对象和被读取的文件关联
         FileReader fr=new FileReader("b.txt");//文件必须存在
         int num;
         
         //2.1 读取数据  int read()读取单个字符，返回->字符编码 比如a,num就返回97
         /*
         while((num=fr.read())!=-1){//读取到最后一个字符，会返回-1
        	                         //用来判断是否读取完毕
        	System.out.print((char)num);
        	 
         }*/
         
         //输出不能加ln换行，破坏文件的原有排版，保证读取的原始性
         
         //2.2 读取数据,将字符读入到数组  int read(char[] f)
         char []arr=new char[2];//2表示每次读取存入到数组中的字符个数
                                //一般为1024，或者1024的整数倍
         while((num=fr.read(arr))!=-1){
        	// System.out.println(num);//num表示读取字符的个数
            System.out.print(new String(arr,0,num));//在数组中从0开始,读多少个
         }
         //这种读取到数组中的方法效率要比读取单个字符速度快
         fr.close();
         
	}

}
=======
package io;


import java.io.FileReader;
import java.io.IOException;

public class Demo13 {

	public static void main(String[] args) throws IOException {
		//从文本中读取文件
		//因为是文本->字符流，因为是读取->Reader，因为是操作文件->用操作文件的字符输入流
		//1.创建文件读取流对象和被读取的文件关联
         FileReader fr=new FileReader("b.txt");//文件必须存在
         int num;
         
         //2.1 读取数据  int read()读取单个字符，返回->字符编码 比如a,num就返回97
         /*
         while((num=fr.read())!=-1){//读取到最后一个字符，会返回-1
        	                         //用来判断是否读取完毕
        	System.out.print((char)num);
        	 
         }*/
         
         //输出不能加ln换行，破坏文件的原有排版，保证读取的原始性
         
         //2.2 读取数据,将字符读入到数组  int read(char[] f)
         char []arr=new char[2];//2表示每次读取存入到数组中的字符个数
                                //一般为1024，或者1024的整数倍
         while((num=fr.read(arr))!=-1){
        	// System.out.println(num);//num表示读取字符的个数
            System.out.print(new String(arr,0,num));//在数组中从0开始,读多少个
         }
         //这种读取到数组中的方法效率要比读取单个字符速度快
         fr.close();
         
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
