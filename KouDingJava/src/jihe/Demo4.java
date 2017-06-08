package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Demo4 {
	int age;
	int a;
public Demo4(int age,int a){
	this.a=a;
	this.age=age;
}
	public static void main(String[] args) {
		List col = new ArrayList();
//		col.add("java01");
//		col.add("java02");
//		col.add(26);//Integer
//		col.add("java03");
		//sop(col);
//		Demo4 d=new Demo4(5, 6);
//		sop(d);
		
//		  Collection col2=new ArrayList();
//        col2.add("html");
//        col2.add("mysql");
//        col.addAll(col2);//把别的集合中的所有对象加入到当前集合
       
//        col.remove(26);//删除集合中的某个对象,会返回删除的对象
//        col.removeAll(col2);//删除col2中与col集合相同的数据
//        col.clear();//清空所有的对象
//        sop(col);
//        sop(col.contains(26));
//        sop(col.isEmpty());
//        sop(col.size());
        
//		Object[] array=col.toArray();
//        for(int i=0;i<array.length;i++){
//        	sop(array[i]);
//        }
        
     /*   
     Iterator it=col.iterator();
	  while(it.hasNext()){
		 Object obj= it.next();
		 if("java03".equals(obj)){
		 //在迭代的过程中使用(集合)删除，添加集合中的对象出现了异常，修改可以
		 //删除需要使用(迭代器)的删除方法,就能删除(当前)对象,(迭代器)没有添加的方法
		 //如想直接添加，修改，删除，用listIterator
		 //col.set(1, "hello");//可以通过
		 //col.remove("java01");//异常
	        //col.add("my");  //异常
	        //it.remove();     //通过
		 }
	  }
	  */      
		
	/*
	  ListIterator ite=col.listIterator();
	  while(ite.hasNext()){
		  Object obj=ite.next();
	      if("java03".equals(obj)){
	    	  //ite.add("s1");
	    	 //ite.remove();
	    	 // ite.set("Java03");
	      }
	  }
	  */
		/*
		 Vector v=new Vector();
		 v.add("s1");
		 v.add("s2");
		 v.add("s3");
		 Enumeration e=v.elements();
		 while(e.hasMoreElements()){
		 Object obj=e.nextElement();
		 //System.out.println(obj);
		 }
		 */
	     // sop(col);
	     // sop(v);
		
//		HashSet hs=new HashSet();
//		hs.add("java01");
//		hs.add("java02");
//		hs.add("java01");
//		Iterator<String> it=hs.iterator();
//		while(it.hasNext()){
//		String ss=it.next();
//		System.out.println(ss);
//		}
	                                           //被ArrayList替代
	}             //不安全         不安全        安全
	              //查快,增删慢    查慢,增删快    查快,增删慢
	              //数组          链表          数组
	//Collection(list(Arraylist Linkedlist  Vector)   set(hashset  treeset))
               //有序,可重复                               //无序，不可重复
	//一。list独有的方法都是带有下标的，可精确到下标进行增删改查
	
	//linkedlist中特有的方法:          jdk1.6之后的新方法
	// 1.addFirst() addLast() 这三个数据为空会异常       offer 这三个新方法执行时数据为空时不会异常，返回null
	// 2.getFirst() getLast()                   peek
	// 3.removeFirst() removeLast()             poll
	//linkedlist特点:先进后出(栈)   还有 先进先出(队列)
	
	//Arraylist主要理解contains方法的底层是用equals()比较的,主要用来去重，把它放到一个新的集合中去
	//equals()在object基类中是比较内存地址的，只不过String类中重写了该方法，equals用来比较对象的值了,==用来比较对象的内存地址
	
	//输出一个(非集合对象)就是输出它的toString()表示，是字符串表示(包名.类名+@+哈希值的16进制表示)
	//需要重写toString方法输出该对象属性的具体值
	
	//二。set
	//HashSet:底层为哈希表，线程不安全 
	//通过hashcode比较,如果哈希值相同，在调用equals方法，来判断是否是同一个对象
	//位置是通过哈希算法随机确定的，所以无序
	
	//TreeSet:底层为二叉树,线程不安全
	//在使用add方法添加对象时会自动排序
	//排序方式一(默认)：集合中对象所属的类实现了comparable接口中的int compareTo(T a)方法，TreeSet依据该方法排序
	//         保证不重复的方法:通过判断compareTo返回的值是否为0，为0，则不添加。
	
	//排序方式二:实现comparator接口的int compare(T a,T b)方法，需要传递两个参数  
	//        当两个排序方式都存在，这种方法优先
	
	//放的时候,二叉树从上往下与其树基比较，小的放左边，大的放右边
	//取得时候,从一个数左边最底层取，到树基，再到右边
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
