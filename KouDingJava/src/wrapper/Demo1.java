<<<<<<< HEAD
package wrapper;

public class Demo1 {
	/*°ü×°Àà£º
	 * byte 
	 * short
	 * int 
	 * long
	 * char
	 * boolean
	 * float
	 * double 
	 * °ü×°ÀàµÄ×÷ÓÃ:
	 * 1.¿ÉÒÔÊµÏÖ»ù±¾Êý¾ÝÀàÐÍºÍ×Ö·û´®ÀàÐÍµÄ×ª»»
	 * 2.½øÖÆÖ®¼äµÄ×ª»»
	 */
	public static void main(String[] args) {
	  System.out.println(Integer.MIN_VALUE);
	  //»ù±¾Êý¾Ý×ª»»Îª×Ö·û´®
	  String s1=Integer.toString(3);
	  System.out.println(s1);
	  
	  String s2=String.valueOf(false);
	  System.out.println(s2);
	  
	  //×Ö·û´®ÀàÐÍ×ª»»Îª»ù±¾Êý¾Ý
       int age=Integer.parseInt("25");
       System.out.println(age);
       double d=Double.parseDouble("23.56");
       System.out.println(d);
       
       //Ê®½øÖÆ×ªÎªÆäËû½øÖÆ
      String s3=Integer.toHexString(60);//Ê®Áù½øÖÆ
      System.out.println(s3);
      String s4=Integer.toOctalString(60);//°Ë½øÖÆ
      System.out.println(s4);
      String s5=Integer.toBinaryString(60);//¶þ½øÖÆ
      System.out.println(s5);
      //ÆäËû½øÖÆ×ª»»ÎªÊ®½øÖÆ
      int num1=Integer.parseInt("3c", 16);//16±íÊ¾Õâ¸öÊýÊÇ¶àÉÙ½øÖÆµÄ
      System.out.println(num1);
      
      //×Ô¶¯×°Ïä²ðÏä-----Ò»¸öÊýÈç¹ûÒÑ¾­´´½¨¶ÔÏóÁË£¬ÄÇÃ´ÔÙ´Î´´½¨£¬Ê¹ÓÃÒÑÓÐµÄ
	}
	
}

=======
package wrapper;

public class Demo1 {
	/*åŒ…è£…ç±»ï¼š
	 * byte 
	 * short
	 * int 
	 * long
	 * char
	 * boolean
	 * float
	 * double 
	 * åŒ…è£…ç±»çš„ä½œç”¨:
	 * 1.å¯ä»¥å®žçŽ°åŸºæœ¬æ•°æ®ç±»åž‹å’Œå­—ç¬¦ä¸²ç±»åž‹çš„è½¬æ¢
	 * 2.è¿›åˆ¶ä¹‹é—´çš„è½¬æ¢
	 */
	public static void main(String[] args) {
	  System.out.println(Integer.MIN_VALUE);
	  //åŸºæœ¬æ•°æ®è½¬æ¢ä¸ºå­—ç¬¦ä¸²
	  String s1=Integer.toString(3);
	  System.out.println(s1);
	  
	  String s2=String.valueOf(false);
	  System.out.println(s2);
	  
       //å­—ç¬¦ä¸²ç±»åž‹(è¯¥å­—ç¬¦ä¸²å¿…é¡»ä¸ºæ•°å­—ï¼Œæ–‡å­—ä¼šæŠ¥java.lang.NumberFormatException)è½¬æ¢ä¸ºåŸºæœ¬æ•°æ®
       int age=Integer.parseInt("25");
       System.out.println(age);
       double d=Double.parseDouble("23.56");
       System.out.println(d);
	Double s=Double.valueOf("24");	
        System.out.println(s);
       //åè¿›åˆ¶è½¬ä¸ºå…¶ä»–è¿›åˆ¶
      String s3=Integer.toHexString(60);//åå…­è¿›åˆ¶
      System.out.println(s3);
      String s4=Integer.toOctalString(60);//å…«è¿›åˆ¶
      System.out.println(s4);
      String s5=Integer.toBinaryString(60);//äºŒè¿›åˆ¶
      System.out.println(s5);
      //å…¶ä»–è¿›åˆ¶è½¬æ¢ä¸ºåè¿›åˆ¶
      int num1=Integer.parseInt("3c", 16);//16è¡¨ç¤ºè¿™ä¸ªæ•°æ˜¯å¤šå°‘è¿›åˆ¶çš„
      System.out.println(num1);
      
      //è‡ªåŠ¨è£…ç®±æ‹†ç®±-----ä¸€ä¸ªæ•°å¦‚æžœå·²ç»åˆ›å»ºå¯¹è±¡äº†ï¼Œé‚£ä¹ˆå†æ¬¡åˆ›å»ºï¼Œä½¿ç”¨å·²æœ‰çš„
      //åœ¨è‡ªåŠ¨è£…ç®±æ—¶å¯¹äºŽå€¼ä»Žâ€“128åˆ°127ä¹‹é—´çš„å€¼ï¼Œå®ƒä»¬è¢«è£…ç®±ä¸ºIntegerå¯¹è±¡åŽï¼Œä¼šå­˜åœ¨å†…å­˜ä¸­è¢«é‡ç”¨ï¼Œå§‹ç»ˆåªå­˜åœ¨ä¸€ä¸ªå¯¹è±¡
      //è€Œå¦‚æžœè¶…è¿‡äº†ä»Žâ€“128åˆ°127ä¹‹é—´çš„å€¼ï¼Œè¢«è£…ç®±åŽçš„Integerå¯¹è±¡å¹¶ä¸ä¼šè¢«é‡ç”¨ï¼Œå³ç›¸å½“äºŽæ¯æ¬¡è£…ç®±æ—¶éƒ½æ–°å»ºä¸€ä¸ªIntegerå¯¹è±¡ï¼›
      //è‡ªåŠ¨è£…ç®±æ‹†ç®±ä¸ä»…åœ¨åŸºæœ¬æ•°æ®ç±»åž‹ä¸­æœ‰åº”ç”¨ï¼Œåœ¨Stringç±»ä¸­ä¹Ÿæœ‰åº”ç”¨,åŒä¸€ä¸ªå€¼åœ°å€ä¹Ÿæ˜¯é‡ç”¨çš„
	String str = "sl";
      //ä»£æ›¿ä¸‹é¢çš„å£°æ˜Žæ–¹å¼
        String str = new String("sl");
        
	}
}

>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
