package ex6.ĸ��ȭ.�ζ�;

import java.util.Random;

public class Lotto {
	//ĸ��ȭ3 (Lotto��ü �����Լ��� ��������)
	
	//���� ����
	private int[] num;
	private int size;
	
	
	//-------------------------------------
	//�ζ� ��ü���� ���� �ʱ�ȭ�ϱ�
	public static void init(Lotto x) {
		x.size = 6;
		x.num = new int[x.size];
		
	}
	
	//-------------------------------------
	//private int size print()���� ����Ҽ��ֵ��� �ϱ�
	public static int getSize(Lotto lotto) {
		return lotto.size;
	}
	
	//-------------------------------------
	//private int[] num print()��������Ҽ��ֵ��� �ϱ�
	public static int getNum(Lotto lotto, int i) {
		return lotto.num[i];
	}
	
	
	//-------------------------------------
	// �ζǹ�ȣ �����
	public static Lotto gen(Lotto lotto) {
		Random rand = new Random();
		
		for(int i=0; i<6; i++) {
			lotto.num[i]=rand.nextInt(45)+1;
		}
		
		return lotto;	
	}
	
	//-------------------------------------
	// �ζǹ�ȣ ����
	public static void sort(Lotto x) {
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
