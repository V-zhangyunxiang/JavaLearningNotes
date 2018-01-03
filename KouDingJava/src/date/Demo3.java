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
		//´´½¨Ò»¸öÈÕÆÚ¸ñÊ½»¯¶ÔÏó
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//´´½¨ÐèÒª±»¸ñÊ½»¯µÄdate¶ÔÏó
		Date d=new Date();
		//Ê¹ÓÃDateFormat¶ÔÏóµÄ¸ñÊ½»¯·½·¨¶ÔÈÕÆÚ¸ñÊ½»¯
       String time=df.format(d);
       //System.out.println(time);
       
       //×Ô¶¨ÒåËùÏÔÊ¾µÄÈÕÆÚ¸ñÊ½
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
     // System.out.println(nian+"Äê"+yue+"ÔÂ"+ri+"ÈÕ"+",ÐÇÆÚ"+xingqi);
      
      
      // System.out.println(Math.ceil(34.56));//´óÓÚÖ¸¶¨ÊýµÄ×îÐ¡ÕûÊý
     // System.out.println(Math.floor(34.55));//Ð¡ÓëÖ¸¶¨ÊýµÄ×î´óÕûÊý
     // System.out.println(Math.pow(3, 3));//¼¸µÄ¼¸´ÎÃÝ
    //  System.out.println(Math.sqrt(4));//¿ª·½
      
      //´óÓÚµÈÓÚ0.0£¬Ð¡ÓÚ1.0µÄËæ»úÐ¡Êý--Math.random()
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
		//åˆ›å»ºä¸€ä¸ªæ—¥æœŸæ ¼å¼åŒ–å¯¹è±¡
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//åˆ›å»ºéœ€è¦è¢«æ ¼å¼åŒ–çš„dateå¯¹è±¡
		Date d=new Date();
		//ä½¿ç”¨DateFormatå¯¹è±¡çš„æ ¼å¼åŒ–æ–¹æ³•å¯¹æ—¥æœŸæ ¼å¼åŒ–
       String time=df.format(d);
       //System.out.println(time);
       
       //è‡ªå®šä¹‰æ‰€æ˜¾ç¤ºçš„æ—¥æœŸæ ¼å¼
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
     // System.out.println(nian+"å¹´"+yue+"æœˆ"+ri+"æ—¥"+",æ˜ŸæœŸ"+xingqi);
      
      
      // System.out.println(Math.ceil(34.56));//å¤§äºŽæŒ‡å®šæ•°çš„æœ€å°æ•´æ•°
     // System.out.println(Math.floor(34.55));//å°ä¸ŽæŒ‡å®šæ•°çš„æœ€å¤§æ•´æ•°
     // System.out.println(Math.pow(3, 3));//å‡ çš„å‡ æ¬¡å¹‚
    //  System.out.println(Math.sqrt(4));//å¼€æ–¹
      
      //å¤§äºŽç­‰äºŽ0.0ï¼Œå°äºŽ1.0çš„éšæœºå°æ•°--Math.random()
      System.out.println(Math.random());
      //å¤§äºŽç­‰äºŽ0ï¼Œå°äºŽ2çš„éšæœºæ•°
      System.out.println(Math.random()*2);
      Random ra=new Random();
      System.out.println((ra.nextInt(10)+1));
      
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
