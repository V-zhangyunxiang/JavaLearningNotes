
package date;

import java.util.Date;

public class Demo2 {
	
	public static void main(String[] args) {
		//long����ת��Ϊdate
		long s=System.currentTimeMillis();
		Date date=new Date(s);
		System.out.println(date);
	
         //dateת��Ϊlong
		long l=date.getTime();
		System.out.println(l);
	}

}

