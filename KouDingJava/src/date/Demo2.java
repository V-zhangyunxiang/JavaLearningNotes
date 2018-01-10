
package date;

import java.util.Date;

public class Demo2 {
	
	public static void main(String[] args) {
		//long类型转换为date
		long s=System.currentTimeMillis();
		Date date=new Date(s);
		System.out.println(date);
	
         //date转换为long
		long l=date.getTime();
		System.out.println(l);
	}

}

