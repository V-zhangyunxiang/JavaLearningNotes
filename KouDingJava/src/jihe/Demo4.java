<<<<<<< HEAD
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
	                                        //被ArrayList替代
	}                 //不安全            不安全                安全
	                  //查快,增删慢    查慢,增删快    查快,增删慢
	                  //数组                  链表                 数组
	//Collection(list(Arraylist Linkedlist  Vector)   set(hashset  treeset))
               //有序,可重复                                                                  //无序，不可重复
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
=======
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
//        col.addAll(col2);//鎶婂埆鐨勯泦鍚堜腑鐨勬墍鏈夊璞″姞鍏ュ埌褰撳墠闆嗗悎
       
//        col.remove(26);//鍒犻櫎闆嗗悎涓殑鏌愪釜瀵硅薄,浼氳繑鍥炲垹闄ょ殑瀵硅薄
//        col.removeAll(col2);//鍒犻櫎col2涓笌col闆嗗悎鐩稿悓鐨勬暟鎹�
//        col.clear();//娓呯┖鎵�鏈夌殑瀵硅薄
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
		 //鍦ㄨ凯浠ｇ殑杩囩▼涓娇鐢�(闆嗗悎)鍒犻櫎锛屾坊鍔犻泦鍚堜腑鐨勫璞″嚭鐜颁簡寮傚父锛屼慨鏀瑰彲浠�
		 //鍒犻櫎闇�瑕佷娇鐢�(杩唬鍣�)鐨勫垹闄ゆ柟娉�,灏辫兘鍒犻櫎(褰撳墠)瀵硅薄,(杩唬鍣�)娌℃湁娣诲姞鐨勬柟娉�
		 //濡傛兂鐩存帴娣诲姞锛屼慨鏀癸紝鍒犻櫎锛岀敤listIterator
		 //col.set(1, "hello");//鍙互閫氳繃
		 //col.remove("java01");//寮傚父
	        //col.add("my");  //寮傚父
	        //it.remove();     //閫氳繃
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
	                                           //琚獳rrayList鏇夸唬
	}             //涓嶅畨鍏�         涓嶅畨鍏�        瀹夊叏
	              //鏌ュ揩,澧炲垹鎱�    鏌ユ參,澧炲垹蹇�    鏌ュ揩,澧炲垹鎱�
	              //鏁扮粍          閾捐〃          鏁扮粍
	//Collection(list(Arraylist Linkedlist  Vector)   set(hashset  treeset))
               //鏈夊簭,鍙噸澶�                               //鏃犲簭锛屼笉鍙噸澶�
	//涓�銆俵ist鐙湁鐨勬柟娉曢兘鏄甫鏈変笅鏍囩殑锛屽彲绮剧‘鍒颁笅鏍囪繘琛屽鍒犳敼鏌�
	
	//linkedlist涓壒鏈夌殑鏂规硶:          jdk1.6涔嬪悗鐨勬柊鏂规硶
	// 1.addFirst() addLast() 杩欎笁涓暟鎹负绌轰細寮傚父       offer 杩欎笁涓柊鏂规硶鎵ц鏃舵暟鎹负绌烘椂涓嶄細寮傚父锛岃繑鍥瀗ull
	// 2.getFirst() getLast()                   peek
	// 3.removeFirst() removeLast()             poll
	//linkedlist鐗圭偣:鍏堣繘鍚庡嚭(鏍�)   杩樻湁 鍏堣繘鍏堝嚭(闃熷垪)
	
	//Arraylist涓昏鐞嗚Вcontains鏂规硶鐨勫簳灞傛槸鐢╡quals()姣旇緝鐨�,涓昏鐢ㄦ潵鍘婚噸锛屾妸瀹冩斁鍒颁竴涓柊鐨勯泦鍚堜腑鍘�
	//equals()鍦╫bject鍩虹被涓槸姣旇緝鍐呭瓨鍦板潃鐨勶紝鍙笉杩嘢tring绫讳腑閲嶅啓浜嗚鏂规硶锛宔quals鐢ㄦ潵姣旇緝瀵硅薄鐨勫�间簡,==鐢ㄦ潵姣旇緝瀵硅薄鐨勫唴瀛樺湴鍧�
	
	//杈撳嚭涓�涓�(闈為泦鍚堝璞�)灏辨槸杈撳嚭瀹冪殑toString()琛ㄧず锛屾槸瀛楃涓茶〃绀�(鍖呭悕.绫诲悕+@+鍝堝笇鍊肩殑16杩涘埗琛ㄧず)
	//闇�瑕侀噸鍐檛oString鏂规硶杈撳嚭璇ュ璞″睘鎬х殑鍏蜂綋鍊�
	
	//浜屻�俿et
	//HashSet:搴曞眰涓哄搱甯岃〃锛岀嚎绋嬩笉瀹夊叏 
	//閫氳繃hashcode姣旇緝,濡傛灉鍝堝笇鍊肩浉鍚岋紝鍦ㄨ皟鐢╡quals鏂规硶锛屾潵鍒ゆ柇鏄惁鏄悓涓�涓璞�
	//浣嶇疆鏄�氳繃鍝堝笇绠楁硶闅忔満纭畾鐨勶紝鎵�浠ユ棤搴�
	
	//TreeSet:搴曞眰涓轰簩鍙夋爲,绾跨▼涓嶅畨鍏�
	//鍦ㄤ娇鐢╝dd鏂规硶娣诲姞瀵硅薄鏃朵細鑷姩鎺掑簭
	//鎺掑簭鏂瑰紡涓�(榛樿)锛氶泦鍚堜腑瀵硅薄鎵�灞炵殑绫诲疄鐜颁簡comparable鎺ュ彛涓殑int compareTo(T a)鏂规硶锛孴reeSet渚濇嵁璇ユ柟娉曟帓搴�
	//         淇濊瘉涓嶉噸澶嶇殑鏂规硶:閫氳繃鍒ゆ柇compareTo杩斿洖鐨勫�兼槸鍚︿负0锛屼负0锛屽垯涓嶆坊鍔犮��
	
	//鎺掑簭鏂瑰紡浜�:瀹炵幇comparator鎺ュ彛鐨刬nt compare(T a,T b)鏂规硶锛岄渶瑕佷紶閫掍袱涓弬鏁�  
	//        褰撲袱涓帓搴忔柟寮忛兘瀛樺湪锛岃繖绉嶆柟娉曚紭鍏�
	
	//鏀剧殑鏃跺��,浜屽弶鏍戜粠涓婂線涓嬩笌鍏舵爲鍩烘瘮杈冿紝灏忕殑鏀惧乏杈癸紝澶х殑鏀惧彸杈�
	//鍙栧緱鏃跺��,浠庝竴涓暟宸﹁竟鏈�搴曞眰鍙栵紝鍒版爲鍩猴紝鍐嶅埌鍙宠竟
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
