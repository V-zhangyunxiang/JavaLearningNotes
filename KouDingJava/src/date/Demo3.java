<<<<<<< HEAD
package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个日期格式化对象
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//创建需要被格式化的date对象
		Date d=new Date();
		//使用DateFormat对象的格式化方法对日期格式化
       String time=df.format(d);
       //System.out.println(time);
       
       //自定义所显示的日期格式
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd E hh:mm:ss");
       Date d2=new Date(); 
       String shijian=sdf.format(d2);
      // System.out.println(shijian);
       
       //
      Calendar cal=Calendar.getInstance();
      int nian= cal.get(Calendar.YEAR);
      int yue=cal.get(Calendar.MONTH)+1;
      int ri=cal.get(Calendar.DAY_OF_MONTH);
      int xingqi=cal.get(Calendar.DAY_OF_WEEK)-1;
     // System.out.println(nian+"年"+yue+"月"+ri+"日"+",星期"+xingqi);
      
      
      // System.out.println(Math.ceil(34.56));//大于指定数的最小整数
     // System.out.println(Math.floor(34.55));//小与指定数的最大整数
     // System.out.println(Math.pow(3, 3));//几的几次幂
    //  System.out.println(Math.sqrt(4));//开方
      
      //大于等于0.0，小于1.0的随机小数--Math.random()
      System.out.println(Math.random());
      
      Random ra=new Random();
      System.out.println((ra.nextInt(10)+1));
      
	}

}
=======
package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//鍒涘缓涓�涓棩鏈熸牸寮忓寲瀵硅薄
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//鍒涘缓闇�瑕佽鏍煎紡鍖栫殑date瀵硅薄
		Date d=new Date();
		//浣跨敤DateFormat瀵硅薄鐨勬牸寮忓寲鏂规硶瀵规棩鏈熸牸寮忓寲
       String time=df.format(d);
       //System.out.println(time);
       
       //鑷畾涔夋墍鏄剧ず鐨勬棩鏈熸牸寮�
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd E hh:mm:ss");
       Date d2=new Date(); 
       String shijian=sdf.format(d2);
      // System.out.println(shijian);
       
       //
      Calendar cal=Calendar.getInstance();
      int nian= cal.get(Calendar.YEAR);
      int yue=cal.get(Calendar.MONTH)+1;
      int ri=cal.get(Calendar.DAY_OF_MONTH);
      int xingqi=cal.get(Calendar.DAY_OF_WEEK)-1;
     // System.out.println(nian+"骞�"+yue+"鏈�"+ri+"鏃�"+",鏄熸湡"+xingqi);
      
      
      // System.out.println(Math.ceil(34.56));//澶т簬鎸囧畾鏁扮殑鏈�灏忔暣鏁�
     // System.out.println(Math.floor(34.55));//灏忎笌鎸囧畾鏁扮殑鏈�澶ф暣鏁�
     // System.out.println(Math.pow(3, 3));//鍑犵殑鍑犳骞�
    //  System.out.println(Math.sqrt(4));//寮�鏂�
      
      //澶т簬绛変簬0.0锛屽皬浜�1.0鐨勯殢鏈哄皬鏁�--Math.random()
      System.out.println(Math.random());
      //澶т簬绛変簬0锛屽皬浜�2鐨勯殢鏈烘暟
      System.out.println(Math.random()*2);
      Random ra=new Random();
      System.out.println((ra.nextInt(10)+1));
      
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
