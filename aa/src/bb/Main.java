package bb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	 
	static int j;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ÿ���ж��ٸ���n:");
		int n=sc.nextInt();
		System.out.println("����������Ƚϵ���m:");
        int m=sc.nextInt();
        System.out.println("�������ж�������������k:");
        int k=sc.nextInt();
        System.out.println("�������!");
        System.out.print("ÿ����"+n+"����"+"\t");
        System.out.print("����"+k+"��"+"\t");
        System.out.print("Ҫ�Ƚϵ���Ϊ:"+m);
      
        for (int i = 0; i < k; i++) {
        	int a1=0;
			for ( j = 0; j <n ; j++) {
			 System.out.println("�������"+i+1+"�����:");
			 System.out.println("�������"+i+1+"��"+"��"+j+1+"����");
			 a1=sc.nextInt();
			}
			ArrayList<Integer> list=new ArrayList<>();
			list.add(a1);
			Iterator<Integer> it=list.iterator();
			while(it.hasNext()){
				Integer h=it.next();	
				int []a=new int[j];
				for (int e = 0; e < a.length; e++) {
					 a[e]=h;
					 int sum=0;
					 sum+=a[e];
					 if(sum>m){
						 count++;
					 }
				}
				
			}
		}
        System.out.println("��������Ϊ:"+count);
        
	}

}
