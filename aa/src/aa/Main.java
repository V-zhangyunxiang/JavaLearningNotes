package aa;

//ˮ�ɻ���
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("������������������֮���ˮ�ɻ���");
        Scanner sc=new Scanner(System.in);
        System.out.println("�������һ����m");
        int m=sc.nextInt();
        System.out.println("������ڶ�����n");
    	int n=sc.nextInt();
    	int a,b,c;
    	for (int i = m; i <= n; i++) {
    		//System.out.println("��ʱi="+i);
    		//System.out.println("��ʱn="+n);
			a=i/100;//��λ
			b=i/10%10;//ʮλ
			c=i%10;//��λ
			if(a*a*a+b*b*b+c*c*c==i){
				//System.out.println("����ˮ�ɻ�");
				list.add(i);
			}
			else{
				if(i==n){
					if(list.isEmpty()){
						System.out.println("�÷�Χ��û��ˮ�ɻ���");
					}
					else{
						Iterator<Integer> ite=list.iterator();
						while(ite.hasNext()){
						Integer in=ite.next();
						System.out.print("ˮ�ɻ���Ϊ:"+in+"\t");
						
						}
						System.out.println("��ѯ����");
					}
				}
			}
		}
    	 sc.close();
	}

}
