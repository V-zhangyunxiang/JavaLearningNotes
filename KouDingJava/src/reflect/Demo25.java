package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo25 {
	/*
	 * 反射:动态获取类(字节码文件),并对其成员进行运行,不需要new对象，就能操作类中的成员(有些情况不能new,只能用反射)
	 * 获取类的共同性:1.构造方法;         2.属性;         3.方法
	 *             getConstructor    getField      getMethod
	 * 获取class的方式:
	 * 1.使用object提供的Class<?> getclass()方法得到字节码文件--需要事先存在对象
	 * 2.每种属性类型都有一个class属性,通过该属性得到的就是字节码文件对象--需要这种类型事先存在
	 * 3.使用Class的静态方法forName(""),字符串由 包名+类名 构成--只需提供一个字符串 （常用）
	 * 
	 * 反射一般结合XML或者properties文件使用，提高程序的可扩展性
	 */

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
	     //getcalss3();
		//得到字节码文件
		Class<?> claz=Class.forName("reflect.Person");
		//创建类对象，Object 可以写成某个具体类
		//第一种：通过 Class 对象的 newInstance() 方法。
		Object obj=claz.newInstance();
        //第二种：通过 Constructor 对象的 newInstance() 方法
         Constructor constructor = clz.getConstructor();
         Object obj = constructor.newInstance();

		//得到属性
		//Field field=claz.getField("name");//只能得到public权限的属性
		Field field2=claz.getDeclaredField("name");//可得到任何权限的属性
		field2.setAccessible(true);//设置可以访问,不然无法赋值
		field2.set(obj, "大伞");//name是非静态，需要用对象obj赋值
		System.out.println(obj);
		
		//得到方法
		Method method=claz.getMethod("show", null);//getMethod(方法名,方法的参数类型,如int.class)
        //Method method=claz.getDeclaredMethod("show", null);
        method.setAccessible(true);//设置可以访问,不然无法调用
		method.invoke(obj, null);//invoke(对象,给方法传的实参)
		
	}
	public static void getclass1(){
		Person ren=new Person();
		Class<? extends Person> claz=ren.getClass();
		//不管创建多少个对象,getclass()都只能获取同一个class
	}
	public static void getclass2(){
		Class<Person> claz=Person.class;
	}
	public static void getcalss3() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class<?> claz=Class.forName("reflect.Person");//得到字节码对象
		//System.out.println(claz);
		Object obj=claz.newInstance();//创建类对象-使用无参的构造方法
	}
	public static void createobj() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> claz=Class.forName("reflect.Person");//得到字节码对象
		//创建类对象,调用有参的构造方法
		Constructor con=claz.getConstructor(String.class,int.class);
		Object obj=con.newInstance("李四",23);
	}

}

