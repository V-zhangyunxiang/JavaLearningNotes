<<<<<<< HEAD
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo17 {

	public static void main(String[] args) {
		//ʹ�û����������ļ�
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader("b.txt"));
		    bw=new BufferedWriter(new FileWriter("bcopy3.txt"));
		    String line=null;
		    while((line=br.readLine())!=null){
		    	bw.write(line);
		    	bw.newLine();
		    	bw.flush();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null)
				bw.close();
				if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
=======
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo17 {

	public static void main(String[] args) {
		//ʹ�û����������ļ�
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader("b.txt"));
		    bw=new BufferedWriter(new FileWriter("bcopy3.txt"));
		    String line=null;
		    while((line=br.readLine())!=null){
		    	bw.write(line);
		    	bw.newLine();
		    	bw.flush();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null)
				bw.close();
				if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
