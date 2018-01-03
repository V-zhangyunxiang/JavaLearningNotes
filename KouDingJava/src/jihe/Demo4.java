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
//        col.addAll(col2);//°Ñ±ğµÄ¼¯ºÏÖĞµÄËùÓĞ¶ÔÏó¼ÓÈëµ½µ±Ç°¼¯ºÏ
       
//        col.remove(26);//É¾³ı¼¯ºÏÖĞµÄÄ³¸ö¶ÔÏó,»á·µ»ØÉ¾³ıµÄ¶ÔÏó
//        col.removeAll(col2);//É¾³ıcol2ÖĞÓëcol¼¯ºÏÏàÍ¬µÄÊı¾İ
//        col.clear();//Çå¿ÕËùÓĞµÄ¶ÔÏó
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
		 //ÔÚµü´úµÄ¹ı³ÌÖĞÊ¹ÓÃ(¼¯ºÏ)É¾³ı£¬Ìí¼Ó¼¯ºÏÖĞµÄ¶ÔÏó³öÏÖÁËÒì³££¬ĞŞ¸Ä¿ÉÒÔ
		 //É¾³ıĞèÒªÊ¹ÓÃ(µü´úÆ÷)µÄÉ¾³ı·½·¨,¾ÍÄÜÉ¾³ı(µ±Ç°)¶ÔÏó,(µü´úÆ÷)Ã»ÓĞÌí¼ÓµÄ·½·¨
		 //ÈçÏëÖ±½ÓÌí¼Ó£¬ĞŞ¸Ä£¬É¾³ı£¬ÓÃlistIterator
		 //col.set(1, "hello");//¿ÉÒÔÍ¨¹ı
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
	                                        //±»ArrayListÌæ´ú
	}                 //²»°²È«            ²»°²È«                °²È«
	                  //²é¿ì,ÔöÉ¾Âı    ²éÂı,ÔöÉ¾¿ì    ²é¿ì,ÔöÉ¾Âı
	                  //Êı×é                  Á´±í                 Êı×é
	//Collection(list(Arraylist Linkedlist  Vector)   set(hashset  treeset))
               //ÓĞĞò,¿ÉÖØ¸´                                                                  //ÎŞĞò£¬²»¿ÉÖØ¸´
	//Ò»¡£list¶ÀÓĞµÄ·½·¨¶¼ÊÇ´øÓĞÏÂ±êµÄ£¬¿É¾«È·µ½ÏÂ±ê½øĞĞÔöÉ¾¸Ä²é
	
	//linkedlistÖĞÌØÓĞµÄ·½·¨:          jdk1.6Ö®ºóµÄĞÂ·½·¨
	// 1.addFirst() addLast() ÕâÈı¸öÊı¾İÎª¿Õ»áÒì³£       offer ÕâÈı¸öĞÂ·½·¨Ö´ĞĞÊ±Êı¾İÎª¿ÕÊ±²»»áÒì³££¬·µ»Ønull
	// 2.getFirst() getLast()                   peek
	// 3.removeFirst() removeLast()             poll
	//linkedlistÌØµã:ÏÈ½øºó³ö(Õ»)   »¹ÓĞ ÏÈ½øÏÈ³ö(¶ÓÁĞ)
	
	//ArraylistÖ÷ÒªÀí½âcontains·½·¨µÄµ×²ãÊÇÓÃequals()±È½ÏµÄ,Ö÷ÒªÓÃÀ´È¥ÖØ£¬°ÑËü·Åµ½Ò»¸öĞÂµÄ¼¯ºÏÖĞÈ¥
	//equals()ÔÚobject»ùÀàÖĞÊÇ±È½ÏÄÚ´æµØÖ·µÄ£¬Ö»²»¹ıStringÀàÖĞÖØĞ´ÁË¸Ã·½·¨£¬equalsÓÃÀ´±È½Ï¶ÔÏóµÄÖµÁË,==ÓÃÀ´±È½Ï¶ÔÏóµÄÄÚ´æµØÖ·
	
	//Êä³öÒ»¸ö(·Ç¼¯ºÏ¶ÔÏó)¾ÍÊÇÊä³öËüµÄtoString()±íÊ¾£¬ÊÇ×Ö·û´®±íÊ¾(°üÃû.ÀàÃû+@+¹şÏ£ÖµµÄ16½øÖÆ±íÊ¾)
	//ĞèÒªÖØĞ´toString·½·¨Êä³ö¸Ã¶ÔÏóÊôĞÔµÄ¾ßÌåÖµ
	
	//¶ş¡£set
	//HashSet:µ×²ãÎª¹şÏ£±í£¬Ïß³Ì²»°²È« 
	//Í¨¹ıhashcode±È½Ï,Èç¹û¹şÏ£ÖµÏàÍ¬£¬ÔÚµ÷ÓÃequals·½·¨£¬À´ÅĞ¶ÏÊÇ·ñÊÇÍ¬Ò»¸ö¶ÔÏó
	//Î»ÖÃÊÇÍ¨¹ı¹şÏ£Ëã·¨Ëæ»úÈ·¶¨µÄ£¬ËùÒÔÎŞĞò
	
	//TreeSet:µ×²ãÎª¶ş²æÊ÷,Ïß³Ì²»°²È«
	//ÔÚÊ¹ÓÃadd·½·¨Ìí¼Ó¶ÔÏóÊ±»á×Ô¶¯ÅÅĞò
	//ÅÅĞò·½Ê½Ò»(Ä¬ÈÏ)£º¼¯ºÏÖĞ¶ÔÏóËùÊôµÄÀàÊµÏÖÁËcomparable½Ó¿ÚÖĞµÄint compareTo(T a)·½·¨£¬TreeSetÒÀ¾İ¸Ã·½·¨ÅÅĞò
	//         ±£Ö¤²»ÖØ¸´µÄ·½·¨:Í¨¹ıÅĞ¶ÏcompareTo·µ»ØµÄÖµÊÇ·ñÎª0£¬Îª0£¬Ôò²»Ìí¼Ó¡£
	
	//ÅÅĞò·½Ê½¶ş:ÊµÏÖcomparator½Ó¿ÚµÄint compare(T a,T b)·½·¨£¬ĞèÒª´«µİÁ½¸ö²ÎÊı  
	//        µ±Á½¸öÅÅĞò·½Ê½¶¼´æÔÚ£¬ÕâÖÖ·½·¨ÓÅÏÈ
	
	//·ÅµÄÊ±ºò,¶ş²æÊ÷´ÓÉÏÍùÏÂÓëÆäÊ÷»ù±È½Ï£¬Ğ¡µÄ·Å×ó±ß£¬´óµÄ·ÅÓÒ±ß
	//È¡µÃÊ±ºò,´ÓÒ»¸öÊı×ó±ß×îµ×²ãÈ¡£¬µ½Ê÷»ù£¬ÔÙµ½ÓÒ±ß
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
//        col.addAll(col2);//æŠŠåˆ«çš„é›†åˆä¸­çš„æ‰€æœ‰å¯¹è±¡åŠ å…¥åˆ°å½“å‰é›†åˆ
       
//        col.remove(26);//åˆ é™¤é›†åˆä¸­çš„æŸä¸ªå¯¹è±¡,ä¼šè¿”å›åˆ é™¤çš„å¯¹è±¡
//        col.removeAll(col2);//åˆ é™¤col2ä¸­ä¸colé›†åˆç›¸åŒçš„æ•°æ®
//        col.clear();//æ¸…ç©ºæ‰€æœ‰çš„å¯¹è±¡
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
		 //åœ¨è¿­ä»£çš„è¿‡ç¨‹ä¸­ä½¿ç”¨(é›†åˆ)åˆ é™¤ï¼Œæ·»åŠ é›†åˆä¸­çš„å¯¹è±¡å‡ºç°äº†å¼‚å¸¸ï¼Œä¿®æ”¹å¯ä»¥
		 //åˆ é™¤éœ€è¦ä½¿ç”¨(è¿­ä»£å™¨)çš„åˆ é™¤æ–¹æ³•,å°±èƒ½åˆ é™¤(å½“å‰)å¯¹è±¡,(è¿­ä»£å™¨)æ²¡æœ‰æ·»åŠ çš„æ–¹æ³•
		 //å¦‚æƒ³ç›´æ¥æ·»åŠ ï¼Œä¿®æ”¹ï¼Œåˆ é™¤ï¼Œç”¨listIterator
		 //col.set(1, "hello");//å¯ä»¥é€šè¿‡
		 //col.remove("java01");//å¼‚å¸¸
	        //col.add("my");  //å¼‚å¸¸
	        //it.remove();     //é€šè¿‡
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
	                                           //è¢«ArrayListæ›¿ä»£
	}             //ä¸å®‰å…¨         ä¸å®‰å…¨        å®‰å…¨
	              //æŸ¥å¿«,å¢åˆ æ…¢    æŸ¥æ…¢,å¢åˆ å¿«    æŸ¥å¿«,å¢åˆ æ…¢
	              //æ•°ç»„          é“¾è¡¨          æ•°ç»„
	//Collection(list(Arraylist Linkedlist  Vector)   set(hashset  treeset))
               //æœ‰åº,å¯é‡å¤                               //æ— åºï¼Œä¸å¯é‡å¤
	//ä¸€ã€‚listç‹¬æœ‰çš„æ–¹æ³•éƒ½æ˜¯å¸¦æœ‰ä¸‹æ ‡çš„ï¼Œå¯ç²¾ç¡®åˆ°ä¸‹æ ‡è¿›è¡Œå¢åˆ æ”¹æŸ¥
	
	//linkedlistä¸­ç‰¹æœ‰çš„æ–¹æ³•:          jdk1.6ä¹‹åçš„æ–°æ–¹æ³•
	// 1.addFirst() addLast() è¿™ä¸‰ä¸ªæ•°æ®ä¸ºç©ºä¼šå¼‚å¸¸       offer è¿™ä¸‰ä¸ªæ–°æ–¹æ³•æ‰§è¡Œæ—¶æ•°æ®ä¸ºç©ºæ—¶ä¸ä¼šå¼‚å¸¸ï¼Œè¿”å›null
	// 2.getFirst() getLast()                   peek
	// 3.removeFirst() removeLast()             poll
	//linkedlistç‰¹ç‚¹:å…ˆè¿›åå‡º(æ ˆ)   è¿˜æœ‰ å…ˆè¿›å…ˆå‡º(é˜Ÿåˆ—)
	
	//Arraylistä¸»è¦ç†è§£containsæ–¹æ³•çš„åº•å±‚æ˜¯ç”¨equals()æ¯”è¾ƒçš„,ä¸»è¦ç”¨æ¥å»é‡ï¼ŒæŠŠå®ƒæ”¾åˆ°ä¸€ä¸ªæ–°çš„é›†åˆä¸­å»
	//equals()åœ¨objectåŸºç±»ä¸­æ˜¯æ¯”è¾ƒå†…å­˜åœ°å€çš„ï¼Œåªä¸è¿‡Stringç±»ä¸­é‡å†™äº†è¯¥æ–¹æ³•ï¼Œequalsç”¨æ¥æ¯”è¾ƒå¯¹è±¡çš„å€¼äº†,==ç”¨æ¥æ¯”è¾ƒå¯¹è±¡çš„å†…å­˜åœ°å€
	
	//è¾“å‡ºä¸€ä¸ª(éé›†åˆå¯¹è±¡)å°±æ˜¯è¾“å‡ºå®ƒçš„toString()è¡¨ç¤ºï¼Œæ˜¯å­—ç¬¦ä¸²è¡¨ç¤º(åŒ…å.ç±»å+@+å“ˆå¸Œå€¼çš„16è¿›åˆ¶è¡¨ç¤º)
	//éœ€è¦é‡å†™toStringæ–¹æ³•è¾“å‡ºè¯¥å¯¹è±¡å±æ€§çš„å…·ä½“å€¼
	
	//äºŒã€‚set
	//HashSet:åº•å±‚ä¸ºå“ˆå¸Œè¡¨ï¼Œçº¿ç¨‹ä¸å®‰å…¨ 
	//é€šè¿‡hashcodeæ¯”è¾ƒ,å¦‚æœå“ˆå¸Œå€¼ç›¸åŒï¼Œåœ¨è°ƒç”¨equalsæ–¹æ³•ï¼Œæ¥åˆ¤æ–­æ˜¯å¦æ˜¯åŒä¸€ä¸ªå¯¹è±¡
	//ä½ç½®æ˜¯é€šè¿‡å“ˆå¸Œç®—æ³•éšæœºç¡®å®šçš„ï¼Œæ‰€ä»¥æ— åº
	
	//TreeSet:åº•å±‚ä¸ºäºŒå‰æ ‘,çº¿ç¨‹ä¸å®‰å…¨
	//åœ¨ä½¿ç”¨addæ–¹æ³•æ·»åŠ å¯¹è±¡æ—¶ä¼šè‡ªåŠ¨æ’åº
	//æ’åºæ–¹å¼ä¸€(é»˜è®¤)ï¼šé›†åˆä¸­å¯¹è±¡æ‰€å±çš„ç±»å®ç°äº†comparableæ¥å£ä¸­çš„int compareTo(T a)æ–¹æ³•ï¼ŒTreeSetä¾æ®è¯¥æ–¹æ³•æ’åº
	//         ä¿è¯ä¸é‡å¤çš„æ–¹æ³•:é€šè¿‡åˆ¤æ–­compareToè¿”å›çš„å€¼æ˜¯å¦ä¸º0ï¼Œä¸º0ï¼Œåˆ™ä¸æ·»åŠ ã€‚
	
	//æ’åºæ–¹å¼äºŒ:å®ç°comparatoræ¥å£çš„int compare(T a,T b)æ–¹æ³•ï¼Œéœ€è¦ä¼ é€’ä¸¤ä¸ªå‚æ•°  
	//        å½“ä¸¤ä¸ªæ’åºæ–¹å¼éƒ½å­˜åœ¨ï¼Œè¿™ç§æ–¹æ³•ä¼˜å…ˆ
	
	//æ”¾çš„æ—¶å€™,äºŒå‰æ ‘ä»ä¸Šå¾€ä¸‹ä¸å…¶æ ‘åŸºæ¯”è¾ƒï¼Œå°çš„æ”¾å·¦è¾¹ï¼Œå¤§çš„æ”¾å³è¾¹
	//å–å¾—æ—¶å€™,ä»ä¸€ä¸ªæ•°å·¦è¾¹æœ€åº•å±‚å–ï¼Œåˆ°æ ‘åŸºï¼Œå†åˆ°å³è¾¹
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
