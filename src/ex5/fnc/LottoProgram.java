package ex5.fnc;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		
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
	
	private static int[] gen() {
		Random rand = new Random();
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = rand.nextInt(100)+1;
		}
		
		return lotto;
	}
	private static void sort(int[] lotto) {
		int temp;
		for(int i=0; i<6; i++) 
			for(int j=0; j<i; j++) 
				if(lotto[i]<lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
	}

	private static void print(int[] lotto) {
		for(int i=0; i<6; i++) {
			System.out.printf("["+"%d"+"] ",lotto[i]);
 
		}
		System.out.println();
		
	}

	

}