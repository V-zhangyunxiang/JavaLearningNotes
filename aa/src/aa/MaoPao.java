package aa;

public class MaoPao {
    //ð������ÿ���������������������бȽϣ�ÿ��ȡ��������,ÿ���ٱȽ�һ����(��Ϊ�Ѿ����������)
	//Arrays.sort(a); �÷���ֱ���ڲ���ð������.
	public static void main(String[] args) {
		int[] a = { 7, 6, 9, 11,88,2,44 };
		for (int i = 0; i < a.length-1; i++) {   //һ���ж�����
            for (int j = 0; j < a.length-i-1; j++) {  //ÿһ�ֱȽϵ��±귶Χ
				if(a[j+1]<a[j]){               //ǰһ�����ں�һ��
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("����������Ԫ������:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}

}
