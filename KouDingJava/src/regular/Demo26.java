package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo26 {
/*������ʽ:����ַ����Ĳ���
 * +:һ�λ��߶��  *:0�λ���  ?:0�λ�һ��   ת���ַ���\\����һ����б��  \\d
 * 
 * 1.ƥ��:
 *   ʹ�õ���String���е�boolean matches()����
 * 2.�и�:
 *   ʹ�õ���String���е�split()
 * 3.�滻:
 *   ʹ�õ���String���е�replaceAll()
 * 4.��ȡ:
 *    
 */
	public static void main(String[] args) {
	String ss="booook";
	String regex="bo?k";
	boolean b=ss.matches(regex);
    
	String tel="13455678890";
	String regex2="1[34578]\\d{9}";
	System.out.println(tel.matches(regex2));
	/*
	String qiege="qi,sl,ss,tt";
	String regex3=",";
	String arr[]=qiege.split(regex3);
	for(String str:arr)
	System.out.print(str);
	*/
	String fenzu="gsf$$$$$dfgrj*****fhyhd@@@@";
	String regex4="(.)\\1+";//()��ʾ�������˼,\\1��ʾȡ��һ���ֵ
	String arr2[]=fenzu.split(regex4);
	for(String str:arr2)
		System.out.print(str);
	
	String haoma="13145678900";
	String regex5="(\\d{3})\\d{4}(\\d{4})";
	String hm=haoma.replaceAll(regex5, "$1****$2");
	System.out.println(hm);
	
	String huoqu="zhi y,u jj k,a llk";
	String regex6="[a-z]{4}";
	Pattern pa=Pattern.compile(regex6);//���ع���
	Matcher ma=pa.matcher(huoqu);//ɸѡ
	while(ma.find()){//�ж��Ƿ���ڷ���������������
    System.out.println(ma.group());  //�õ����Ϲ�����ַ���
	}
	
	
	}
}
