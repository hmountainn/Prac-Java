package ex3.array.test;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		//10�� ũ���� �迭�� 1~10���� ���� �ְ� ��� ���
		
		//1.10�� ¥�� �迭 nums����
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		//2.100�� ����
		Random rand = new Random();
		int temp;
		int idx;
		int idx2;
		
		for(int i=0; i<100; i++) {
			//���� �� ����
			idx=rand.nextInt(10);
			idx2=rand.nextInt(10);
			
			//����
			temp = nums[idx];
			nums[idx] = nums[idx2];
			nums[idx2] = temp;
		}
			
		//3.���
		for(int i=0; i<10; i++)
			System.out.printf("%d ", nums[i]);
	}

}
