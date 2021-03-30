package ex6.capsule;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		//Top Down������ �Լ����α׷� �����
		
		int[] lotto;
		
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
	private static int[] gen() {
		Random rand = new Random();
		int[] list = new int[6];
		
		for(int i=0; i<6; i++) {
			list[i]=rand.nextInt(45)+1;
		}
		
		return list;	
	}
	
	//-------------------------------------
	// �ζǹ�ȣ ���
	private static void print(int[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.printf("["+"%d"+"] ",x[i]);
		}
		System.out.println();
	}
	
	//-------------------------------------
	// �ζǹ�ȣ ����
	private static void sort(int[] x) {
		int temp;
		for(int i=0; i<x.length; i++)
			for(int j=0; j<i; j++) {
				if(x[i]<x[j]) {
					temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}
			}
	}

}
