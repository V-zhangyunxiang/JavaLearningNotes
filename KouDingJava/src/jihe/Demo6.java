package jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo6 {
	
	/*Map:��һ�������Ľӿڣ�������Collection,���ڼ���,һ��һ�ԵĴ�,��Ϊ��ֵ��.
	 * HashMap:�ײ�ʹ�õ������ǹ�ϣ���̲߳���ȫ��
	 * TreeMap:�ײ�ʹ�õ������Ƕ��������̲߳���ȫ��
	 * 
	 * HashMap��֤�����ظ�,���ظ���ԭ���HashSetһ��  
	 * TreeMap������ʽ, ȥ����TreeSetһ��
	 */
	public static void main(String[] args) {
		//���ǲ����ظ��ģ�����ظ� ����ӵĻḲ��֮ǰ��
	   HashMap<String , String> map=new HashMap<String, String>();
	   map.put("001", "haha");
	   map.put("002", "jj");
	   map.put("003", "ll");
//     map.put("001", "xii");//������һ����ͬ����ֵ
//     map.remove("001");//���ݼ�ɾ��һ��
//	   System.out.println(map);
	   
//	   String value=map.get("002");//���ݼ���ȡֵ
//     System.out.println(value);
	   
//     System.out.println(map.values());//�õ�����ֵ
//	   map.replace("001", "mm");//�滻
//	   System.out.println(map.values());
	   
//	   boolean b= map.containsKey("001");
//	   boolean a= map.containsValue("jj");
//	   System.out.println(b+"-"+a);
	   
	   //����Map����
	   
	   //��һ�ַ���KeySet() ���õ�����set���ϣ���ͨ���������õ�ֵ
//	   Set<String> keys= map.keySet();
//	   Iterator<String> ite= keys.iterator();
//	    while(ite.hasNext()){
//	    	String key=ite.next();
//	    	String va=map.get(key);
//	    	System.out.println(key+"-"+va);
//	    }
	    
	    //�ڶ��ַ��� entrySet() �õ�ÿ����ֵ�� ��Ӧ��ӳ���ϵ���͵�ֵ���浽set����
	    //�����ظü��ϣ������ӳ���ϵ����ֵ�м����Եõ�����Ҳ���Եõ�ֵ
	    	Set<Map.Entry<String, String>> entry= map.entrySet();
	    	Iterator<Map.Entry<String, String>> ite2=entry.iterator();
	        while(ite2.hasNext()){
	         Map.Entry<String, String> en=ite2.next();
	         String k=en.getKey();
	         String value=en.getValue();
	         System.out.println(k+"-"+value);
	        }
	      //Entry�Ƕ�����Map�е�һ����̬�ӿ�
	     //���˼��ϣ����˼����еļ�ֵ�ԣ��Ż����ӳ���ϵ
	     //����ӳ���ǶԼ����ڲ����������,���Զ�����Map�ڲ�
	   
	        
	        
	        
	}

}
