package ex3.array;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//�迭 ���� �� ���� �� �ֱ�
		
		//1.Random��ü ����
		Random rand = new Random();
		
		//2.�迭 ����
		int array[] = new int[5];
		
		//3.1~45���� ������ �ֱ�
		for(int i=0; i<array.length; i++)
			array[i] = rand.nextInt(45)+1;
		
		//3.���
		for(int i=0; i<array.length; i++)
			System.out.printf("%d ",array[i]);

	}

}
