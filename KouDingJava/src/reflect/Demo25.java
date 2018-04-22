package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo25 {
	/*
	 * ����:��̬��ȡ��(�ֽ����ļ�),�������Ա��������,����Ҫnew���󣬾��ܲ������еĳ�Ա(��Щ�������new,ֻ���÷���)
	 * ��ȡ��Ĺ�ͬ��:1.���췽��;         2.����;         3.����
	 *             getConstructor    getField      getMethod
	 * ��ȡclass�ķ�ʽ:
	 * 1.ʹ��object�ṩ��Class<?> getclass()�����õ��ֽ����ļ�--��Ҫ���ȴ��ڶ���
	 * 2.ÿ���������Ͷ���һ��class����,ͨ�������Եõ��ľ����ֽ����ļ�����--��Ҫ�����������ȴ���
	 * 3.ʹ��Class�ľ�̬����forName(""),�ַ����� ����+���� ����--ֻ���ṩһ���ַ��� �����ã�
	 * 
	 * ����һ����XML����properties�ļ�ʹ�ã���߳���Ŀ���չ��
	 */

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
	     //getcalss3();
		//�õ��ֽ����ļ�
		Class<?> claz=Class.forName("reflect.Person");
		//���������Object ����д��ĳ��������
		//��һ�֣�ͨ�� Class ����� newInstance() ������
		Object obj=claz.newInstance();
        //�ڶ��֣�ͨ�� Constructor ����� newInstance() ����
         Constructor constructor = clz.getConstructor();
         Object obj = constructor.newInstance();

		//�õ�����
		//Field field=claz.getField("name");//ֻ�ܵõ�publicȨ�޵�����
		Field field2=claz.getDeclaredField("name");//�ɵõ��κ�Ȩ�޵�����
		field2.setAccessible(true);//���ÿ��Է���,��Ȼ�޷���ֵ
		field2.set(obj, "��ɡ");//name�ǷǾ�̬����Ҫ�ö���obj��ֵ
		System.out.println(obj);
		
		//�õ�����
		Method method=claz.getMethod("show", null);//getMethod(������,�����Ĳ�������,��int.class)
        //Method method=claz.getDeclaredMethod("show", null);
        method.setAccessible(true);//���ÿ��Է���,��Ȼ�޷�����
		method.invoke(obj, null);//invoke(����,����������ʵ��)
		
	}
	public static void getclass1(){
		Person ren=new Person();
		Class<? extends Person> claz=ren.getClass();
		//���ܴ������ٸ�����,getclass()��ֻ�ܻ�ȡͬһ��class
	}
	public static void getclass2(){
		Class<Person> claz=Person.class;
	}
	public static void getcalss3() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class<?> claz=Class.forName("reflect.Person");//�õ��ֽ������
		//System.out.println(claz);
		Object obj=claz.newInstance();//���������-ʹ���޲εĹ��췽��
	}
	public static void createobj() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> claz=Class.forName("reflect.Person");//�õ��ֽ������
		//���������,�����вεĹ��췽��
		Constructor con=claz.getConstructor(String.class,int.class);
		Object obj=con.newInstance("����",23);
	}

}

