package ex3.array.test2;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		//���ڿ� �迭 �����ٰ� ������� �����ϱ�
		
		//1.�迭����
		String[] list = {"��ȣ��","���缮","����","����ȣ","������","������","�ڹ���"};

		//2.����
		Random rand = new Random();
		int idx, idx2;
		String temp;
		
		
		//3.100�� �ݺ�
		for(int i=0; i<100; i++) {
			idx = rand.nextInt(7);
			idx2 = rand.nextInt(7);
			
			temp = list[idx2];
			list[idx2] = list[idx];
			list[idx] = temp;
		}
		
		//������ ���
		for(int i=0; i<7; i++) {
			if(i < 6)
				System.out.printf("%s,", list[i]);
			else
				System.out.printf("%s", list[i]);
		}
		
		System.out.println();
		
		//4.������� ����
		for(int i=1; i<list.length; i++)
			for(int j=0; j<i; j++)
				if(list[i].compareTo(list[j])<0) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
		
		//5.���
		for(int i=0; i<7; i++) {
			if(i < 6)
				System.out.printf("%s,", list[i]);
			else
				System.out.printf("%s", list[i]);
		}
	}

}
