<<<<<<< HEAD
package io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo12 {
//IO���쳣����
	/*
	 * ����Կ��ܳ��ֵ�exception���뱻�ⲿ�������ĵ����ߣ�֪��,���ڷ����ڲ�try��catch�����exception
	 * ���ϣ���ⲿ֪��������catch��֮���exceptionֱ���׳�
	 * Exception��RuntimeException(��ȻRuntimeException�Ǵ�Exception�̳е�)��
       exception�쳣�����޷�������쳣�� ��io�쳣   ���������쳣�������ⲿԭ����ɵ�,�������޷���֤���ǲ����������������쳣���벶��	
	 * runtimexception��ָ�����Ա�����쳣������ null�����쳣,�����쳣�����ɳ����ڲ�ԭ����ɵ�,�ǿ��Ա����.���������쳣���Ժ������ǣ���һ����������ͻ��쳣��ֹ
	 */
	
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("k:\\temp.txt");//FileNotFoundException
			fw.write("kk");                   //��Ϊ·�����󣬵���fwδ�����ɹ�
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fw!=null)
				fw.close();//NullPointerException
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
         
	}

}
=======
package io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo12 {
//IO���쳣����
	/*
	 * ����Կ��ܳ��ֵ�exception���뱻�ⲿ�������ĵ����ߣ�֪��,���ڷ����ڲ�try��catch�����exception
	 * ���ϣ���ⲿ֪��������catch��֮���exceptionֱ���׳�
	 * Exception��RuntimeException(��ȻRuntimeException�Ǵ�Exception�̳е�)��
       exception�쳣�����޷�������쳣�� ��io�쳣   ���������쳣�������ⲿԭ����ɵ�,�������޷���֤���ǲ����������������쳣���벶��	
	 * runtimexception��ָ�����Ա�����쳣������ null�����쳣,�����쳣�����ɳ����ڲ�ԭ����ɵ�,�ǿ��Ա����.���������쳣���Ժ������ǣ���һ����������ͻ��쳣��ֹ
	 */
	
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("k:\\temp.txt");//FileNotFoundException
			fw.write("kk");                   //��Ϊ·�����󣬵���fwδ�����ɹ�
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fw!=null)
				fw.close();//NullPointerException
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
         
	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
