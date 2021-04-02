package ex7.���;

import java.util.Random;

public class Lotto {

	private int[] num;
	private int size;
	
	//������
	public Lotto() {
		size = 6;
		num = new int[size];
	}
	
	

	//-------------------------------------
	//getSize instance�Լ��� ����
	public int getSize() {
		return size;
	}
	
	
	
	//-------------------------------------
	//private int[] num print()��������Ҽ��ֵ��� �ϱ�
	public int getNum(int i) {
		return this.num[i];
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
