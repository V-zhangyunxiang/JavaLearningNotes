<<<<<<< HEAD
package wrapper;

public class Demo1 {
	/*包装类：
	 * byte 
	 * short
	 * int 
	 * long
	 * char
	 * boolean
	 * float
	 * double 
	 * 包装类的作用:
	 * 1.可以实现基本数据类型和字符串类型的转换
	 * 2.进制之间的转换
	 */
	public static void main(String[] args) {
	  System.out.println(Integer.MIN_VALUE);
	  //基本数据转换为字符串
	  String s1=Integer.toString(3);
	  System.out.println(s1);
	  
	  String s2=String.valueOf(false);
	  System.out.println(s2);
	  
	  //字符串类型转换为基本数据
       int age=Integer.parseInt("25");
       System.out.println(age);
       double d=Double.parseDouble("23.56");
       System.out.println(d);
       
       //十进制转为其他进制
      String s3=Integer.toHexString(60);//十六进制
      System.out.println(s3);
      String s4=Integer.toOctalString(60);//八进制
      System.out.println(s4);
      String s5=Integer.toBinaryString(60);//二进制
      System.out.println(s5);
      //其他进制转换为十进制
      int num1=Integer.parseInt("3c", 16);//16表示这个数是多少进制的
      System.out.println(num1);
      
      //自动装箱拆箱-----一个数如果已经创建对象了，那么再次创建，使用已有的
	}
	
}

=======
package wrapper;

public class Demo1 {
	/*鍖呰绫伙細
	 * byte 
	 * short
	 * int 
	 * long
	 * char
	 * boolean
	 * float
	 * double 
	 * 鍖呰绫荤殑浣滅敤:
	 * 1.鍙互瀹炵幇鍩烘湰鏁版嵁绫诲瀷鍜屽瓧绗︿覆绫诲瀷鐨勮浆鎹�
	 * 2.杩涘埗涔嬮棿鐨勮浆鎹�
	 */
	public static void main(String[] args) {
	  System.out.println(Integer.MIN_VALUE);
	  //鍩烘湰鏁版嵁杞崲涓哄瓧绗︿覆
	  String s1=Integer.toString(3);
	  System.out.println(s1);
	  
	  String s2=String.valueOf(false);
	  System.out.println(s2);
	  
       //瀛楃涓茬被鍨�(璇ュ瓧绗︿覆蹇呴』涓烘暟瀛楋紝鏂囧瓧浼氭姤java.lang.NumberFormatException)杞崲涓哄熀鏈暟鎹�
       int age=Integer.parseInt("25");
       System.out.println(age);
       double d=Double.parseDouble("23.56");
       System.out.println(d);
	Double s=Double.valueOf("24");	
        System.out.println(s);
       //鍗佽繘鍒惰浆涓哄叾浠栬繘鍒�
      String s3=Integer.toHexString(60);//鍗佸叚杩涘埗
      System.out.println(s3);
      String s4=Integer.toOctalString(60);//鍏繘鍒�
      System.out.println(s4);
      String s5=Integer.toBinaryString(60);//浜岃繘鍒�
      System.out.println(s5);
      //鍏朵粬杩涘埗杞崲涓哄崄杩涘埗
      int num1=Integer.parseInt("3c", 16);//16琛ㄧず杩欎釜鏁版槸澶氬皯杩涘埗鐨�
      System.out.println(num1);
      
      //鑷姩瑁呯鎷嗙-----涓�涓暟濡傛灉宸茬粡鍒涘缓瀵硅薄浜嗭紝閭ｄ箞鍐嶆鍒涘缓锛屼娇鐢ㄥ凡鏈夌殑
      //鍦ㄨ嚜鍔ㄨ绠辨椂瀵逛簬鍊间粠鈥�128鍒�127涔嬮棿鐨勫�硷紝瀹冧滑琚绠变负Integer瀵硅薄鍚庯紝浼氬瓨鍦ㄥ唴瀛樹腑琚噸鐢紝濮嬬粓鍙瓨鍦ㄤ竴涓璞�
      //鑰屽鏋滆秴杩囦簡浠庘��128鍒�127涔嬮棿鐨勫�硷紝琚绠卞悗鐨処nteger瀵硅薄骞朵笉浼氳閲嶇敤锛屽嵆鐩稿綋浜庢瘡娆¤绠辨椂閮芥柊寤轰竴涓狪nteger瀵硅薄锛�
      //鑷姩瑁呯鎷嗙涓嶄粎鍦ㄥ熀鏈暟鎹被鍨嬩腑鏈夊簲鐢紝鍦⊿tring绫讳腑涔熸湁搴旂敤,鍚屼竴涓�煎湴鍧�涔熸槸閲嶇敤鐨�
	String str = "sl";
      //浠ｆ浛涓嬮潰鐨勫０鏄庢柟寮�
        String str = new String("sl");
        
	}
}

>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
