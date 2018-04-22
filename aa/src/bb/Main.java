package bb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	 
	static int j;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入每组有多少个数n:");
		int n=sc.nextInt();
		System.out.println("请输入给定比较的数m:");
        int m=sc.nextInt();
        System.out.println("请输入有多少组整数数列k:");
        int k=sc.nextInt();
        System.out.println("输入完毕!");
        System.out.print("每组有"+n+"个数"+"\t");
        System.out.print("共有"+k+"组"+"\t");
        System.out.print("要比较的数为:"+m);
      
        for (int i = 0; i < k; i++) {
        	int a1=0;
			for ( j = 0; j <n ; j++) {
			 System.out.println("请输入第"+i+1+"组的数:");
			 System.out.println("请输入第"+i+1+"组"+"第"+j+1+"个数");
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
        System.out.println("方案个数为:"+count);
        
	}

}
