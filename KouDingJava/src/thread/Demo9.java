<<<<<<< HEAD
package thread;

/*
 * ��Ʊ����
 */
class Ticket extends Thread {
	private static int num = 50;// ������ЩƱ������Ҫ��̬

	public void run(){
		boolean istrue=true;
		while(istrue){
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale"+num--);
		}
		else{
			istrue=false;
		}
		
		}
	}
}

public class Demo9 {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
=======
package thread;

/*
 * ��Ʊ����
 */
class Ticket extends Thread {
	private static int num = 50;// ������ЩƱ������Ҫ��̬

	public void run(){
		boolean istrue=true;
		while(istrue){
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale"+num--);
		}
		else{
			istrue=false;
		}
		
		}
	}
}

public class Demo9 {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
>>>>>>> eb701f607e65845085d7f732a560446847aae8f6
