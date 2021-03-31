package ex6.ĸ��ȭ.�ζ�;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//�ζ� ��ü���� �ڷ��� ����ϱ�
		Lotto lotto;
		
		// �ζǹ�ȣ �����
		lotto = gen();
		// �ζǹ�ȣ ���
		print(lotto);
		// �ζǹ�ȣ ����
		sort(lotto);
		// ���ĵ� ��ȣ ���
		print(lotto);

	}
	
	//-------------------------------------
	// �ζǹ�ȣ �����
	private static Lotto gen() {
		Random rand = new Random();
		
		Lotto list = new Lotto(); //�ζǰ�ü list��� �̸����� ����Ұ�
		list.num = new int[6]; //�ζǰ�ü�ȿ� num�迭 ���
		
		for(int i=0; i<6; i++) {
			list.num[i]=rand.nextInt(45)+1;
		}
		
		return list;	
	}
	
	//-------------------------------------
	// �ζǹ�ȣ ���
	private static void print(Lotto x) {
		for(int i=0; i<x.num.length; i++) {
			System.out.printf("["+"%d"+"] ",x.num[i]);
		}
		System.out.println();
	}
	
	//-------------------------------------
	// �ζǹ�ȣ ����
	private static void sort(Lotto x) {
		int temp;
		for(int i=0; i<x.num.length; i++)
			for(int j=0; j<i; j++) {
				if(x.num[i]<x.num[j]) {
					temp = x.num[j];
					x.num[j] = x.num[i];
					x.num[i] = temp;
				}
			}
	}

}
