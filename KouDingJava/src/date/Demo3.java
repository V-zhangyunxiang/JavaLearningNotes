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
		//����һ�����ڸ�ʽ������
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//������Ҫ����ʽ����date����
		Date d=new Date();
		//ʹ��DateFormat����ĸ�ʽ�����������ڸ�ʽ��
       String time=df.format(d);
       //System.out.println(time);
       
       //�Զ�������ʾ�����ڸ�ʽ
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
     // System.out.println(nian+"��"+yue+"��"+ri+"��"+",����"+xingqi);
      
      
      // System.out.println(Math.ceil(34.56));//����ָ��������С����
     // System.out.println(Math.floor(34.55));//С��ָ�������������
     // System.out.println(Math.pow(3, 3));//���ļ�����
    //  System.out.println(Math.sqrt(4));//����
      
      //���ڵ���0.0��С��1.0�����С��--Math.random()
      System.out.println(Math.random());
      
      Random ra=new Random();
      System.out.println((ra.nextInt(10)+1));
      
	}

}
