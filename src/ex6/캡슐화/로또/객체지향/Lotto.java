package ex6.ĸ��ȭ.�ζ�.��ü����;

import java.util.Random;

public class Lotto {
	//static�޼ҵ�(�Լ�����)���� �ν��Ͻ� �޼ҵ�(��ü����)�� �ٲٱ�
	
	//���� ����
	private int[] num;
	private int size;
	
	
	//-------------------------------------
	//�ζ� ��ü���� ���� �ʱ�ȭ�ϱ�
	public void init() {
		this.size = 6;
		this.num = new int[size];
		
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
	public void gen() {
		Random rand = new Random();
		
		for(int i=0; i<6; i++) {
			this.num[i]=rand.nextInt(45)+1;
		}
	}
	
	//-------------------------------------
	// �ζǹ�ȣ ����
	public void sort() {
		int temp;
		for(int i=0; i<this.size; i++)
			for(int j=0; j<i; j++) {
				if(this.num[i]<this.num[j]) {
					temp = this.num[j];
					this.num[j] = this.num[i];
					this.num[i] = temp;
				}
			}
	}


	
	
}
