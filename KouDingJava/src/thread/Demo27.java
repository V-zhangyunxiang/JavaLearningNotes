package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* �̼߳�ͨ��:�̵߳�����ͬ,�����̲߳�����������ͬ
 * ��������
 * wait():���̷߳����̳߳���
 * notify():�����̳߳��е�����һ���߳�  --����wait����notify������Գ��и���������һ���߳�
 * notifyAll():���������߳�
 * join():����һ���߳�,Ҳ������ĳ���߳���������CPU
 * �̵߳�ֹͣ:stop()�ѹ�ʱ��ֻ���ǵ�ǰ�߳��������ִ�������Ȼ����
 *         1.�������һ�㶼��ѭ����ֹͣѭ������ֹͣ�߳�(flag=true or false)
 *         2.���̵߳ȴ��ܳ�ʱ��,Ҳ���ǵ���wait()��,Ҫ���̶߳������ⲿ����interrupt(),ͬʱ�ı�flagֵ,ǿ�ƽ����ȴ�
 * �ػ��߳�:Ҳ���Ǻ�̨�̣߳�������ǰ̨�߳�,��ǰ̨�߳̽���ʱ���ػ��߳�Ҳ������������:���������̡߳�
 * 
 * ���������߶�����ʱ,��while()����if()�Ļ��ѵȴ���������̲߳���ȫ����,��notifyall���������߳̽����������
 * jdk1.5֮ǰ�����Ĳ�������ʽ��  synchronized(����){}
 * jdk1.5�����Ĳ�������ʽ��:
 *   һ���������Ľӿ�Lock�ӿڣ��������������
 *   ʹ��lock���ͬ�������ķ�ʽ:
 *   1:ʹ��lock�ӿڵ�����Reentrantlock����һ����
 *   2:��֮ǰд��ͬ��������еĴ���д��lock()��unlock()֮��   lock.lock();
 *   3:unlock()Ҫ��try finally�б�֤һ��ִ��                           lock.unlock();
 *   4:wait��notifyҪ��condition�ӿڶ���ʵ�� 
 *   Lock lock = new ReentrantLock();
 *   Condition con=lock.newCondition();   --��������ͬ��Condition������Ʋ�ͬ������
 *   Condition pro=lock.newCondition();     �����ȴ�,����ִ��;����ִ��,�����ȴ�(�������)
 *   con.await(); pro.signal(); signalAll();
 */

class Res {
	 String name;
	 String sex;
	 boolean flag;
	 
}

// ������������
class Input implements Runnable {
	private Res res;

	public Input(Res res) {
		this.res = res;
	}

	public void run() {
		int i = 1;
		while (true) {
			synchronized (res) {
				// ���жϸò��ô�
				if (res.flag)
					try {
						res.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

				if (i == 1) {
					res.name = "�ֶ���";
					res.sex = "��";
				} else {
					res.name = "����԰";
					res.sex = "Ů";
				}
				res.flag = true;
				res.notify();// ���ѶԷ�
			}
			i = (i + 1) % 2; // ��0��1֮��ѭ��
		}
	}
}

// �����������
class Output implements Runnable {
	private Res res;

	public Output(Res res) {
		this.res = res;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (res) {
				if (!res.flag)
					try {
						res.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				System.out.println(res.name + ",,," + res.sex);
				res.flag = false;
				res.notify();
			}

		}
	}

}

public class Demo27 {

	public static void main(String[] args) {
		// ������Դ����
		Res res = new Res();// ����Ķ�����Դ
		// �����������
		Input input = new Input(res);
		// �����������
		Output output = new Output(res);
		// ���������߳�
		Thread t1 = new Thread(input);
		// ��������߳�
		Thread t2 = new Thread(output);

		t1.start();
		t2.start();
//		t2.setDaemon(true);//����Ϊ�ػ��߳�

	}

}
