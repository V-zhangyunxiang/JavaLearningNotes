package wrapper;

public class Demo1 {
	/*��װ�ࣺ
	 * byte 
	 * short
	 * int 
	 * long
	 * char
	 * boolean
	 * float
	 * double 
	 * ��װ�������:
	 * 1.����ʵ�ֻ����������ͺ��ַ������͵�ת��
	 * 2.����֮���ת��
	 */
	public static void main(String[] args) {
	  System.out.println(Integer.MIN_VALUE);
	  //��������ת��Ϊ�ַ���
	  String s1=Integer.toString(3);
	  System.out.println(s1);
	  
	  String s2=String.valueOf(false);
	  System.out.println(s2);
	  
	  //�ַ�������ת��Ϊ��������
       int age=Integer.parseInt("25");
       System.out.println(age);
       double d=Double.parseDouble("23.56");
       System.out.println(d);
       
       //ʮ����תΪ��������
      String s3=Integer.toHexString(60);//ʮ������
      System.out.println(s3);
      String s4=Integer.toOctalString(60);//�˽���
      System.out.println(s4);
      String s5=Integer.toBinaryString(60);//������
      System.out.println(s5);
      //��������ת��Ϊʮ����
      int num1=Integer.parseInt("3c", 16);//16��ʾ������Ƕ��ٽ��Ƶ�
      System.out.println(num1);
      
      //�Զ�װ�����-----һ��������Ѿ����������ˣ���ô�ٴδ�����ʹ�����е�
	}
	
}

