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
//        col.addAll(col2);//�ѱ�ļ����е����ж�����뵽��ǰ����
       
//        col.remove(26);//ɾ�������е�ĳ������,�᷵��ɾ���Ķ���
//        col.removeAll(col2);//ɾ��col2����col������ͬ������
//        col.clear();//������еĶ���
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
		 //�ڵ����Ĺ�����ʹ��(����)ɾ������Ӽ����еĶ���������쳣���޸Ŀ���
		 //ɾ����Ҫʹ��(������)��ɾ������,����ɾ��(��ǰ)����,(������)û����ӵķ���
		 //����ֱ����ӣ��޸ģ�ɾ������listIterator
		 //col.set(1, "hello");//����ͨ��
		 //col.remove("java01");
	     //col.add("my");
	     //it.remove();
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
	                                        //��ArrayList���
	}                 //����ȫ            ����ȫ                ��ȫ
	                  //���,��ɾ��    ����,��ɾ��    ���,��ɾ��
	                  //����                  ����                 ����
	//Collection(list(Arraylist Linkedlist  Vector)   set(hashset  treeset))
               //����,���ظ�                                                                  //���򣬲����ظ�
	//һ��list���еķ������Ǵ����±�ģ��ɾ�ȷ���±������ɾ�Ĳ�
	
	//linkedlist�����еķ���:          jdk1.6֮����·���
	// 1.addFirst() addLast() ����������Ϊ�ջ��쳣       offer �������·���ִ��ʱ����Ϊ��ʱ�����쳣������null
	// 2.getFirst() getLast()                   peek
	// 3.removeFirst() removeLast()             poll
	//linkedlist�ص�:�Ƚ����(ջ)   ���� �Ƚ��ȳ�(����)
	
	//Arraylist��Ҫ���contains�����ĵײ�����equals()�Ƚϵ�,��Ҫ����ȥ�أ������ŵ�һ���µļ�����ȥ
	//equals()��object�������ǱȽ��ڴ��ַ�ģ�ֻ����String������д�˸÷�����equals�����Ƚ϶����ֵ��,==�����Ƚ϶�����ڴ��ַ
	
	//���һ��(�Ǽ��϶���)�����������toString()��ʾ�����ַ�����ʾ(����.����+@+��ϣֵ��16���Ʊ�ʾ)
	//��Ҫ��дtoString��������ö������Եľ���ֵ
	
	//����set
	//HashSet:�ײ�Ϊ��ϣ���̲߳���ȫ 
	//ͨ��hashcode�Ƚ�,�����ϣֵ��ͬ���ڵ���equals���������ж��Ƿ���ͬһ������
	//λ����ͨ����ϣ�㷨���ȷ���ģ���������
	
	//TreeSet:�ײ�Ϊ������,�̲߳���ȫ
	//��ʹ��add������Ӷ���ʱ���Զ�����
	//����ʽһ(Ĭ��)�������ж�����������ʵ����comparable�ӿ��е�int compareTo(T a)������TreeSet���ݸ÷�������
	//         ��֤���ظ��ķ���:ͨ���ж�compareTo���ص�ֵ�Ƿ�Ϊ0��Ϊ0������ӡ�
	
	//����ʽ��:ʵ��comparator�ӿڵ�int compare(T a,T b)��������Ҫ������������  
	//        ����������ʽ�����ڣ����ַ�������
	
	//�ŵ�ʱ��,�����������������������Ƚϣ�С�ķ���ߣ���ķ��ұ�
	//ȡ��ʱ��,��һ���������ײ�ȡ�����������ٵ��ұ�
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
