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

