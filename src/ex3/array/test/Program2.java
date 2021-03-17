package ex3.array.test;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		//10개 크기의 배열에 1~10까지 숫자 넣고 섞어서 출력 + 섞은배열 순서대로 정렬해서 출력
		
		//1.10개 짜리 배열 nums생성
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		//2.100번 섞기
		Random rand = new Random();
		int temp;
		int idx;
		int idx2;
		
		for(int i=0; i<100; i++) {
			//랜덤 값 생성
			idx=rand.nextInt(10);
			idx2=rand.nextInt(10);
			
			//섞기
			temp = nums[idx];
			nums[idx] = nums[idx2];
			nums[idx2] = temp;
		}
			
		//3.출력
		for(int i=0; i<10; i++)
			System.out.printf("%d ", nums[i]);
		
		System.out.println();
		
		//4.순서대로 정렬
		int temp1;
		for(int i=0; i<10; i++) 
			for(int j=0; j<i; j++) {
				if(nums[i]<nums[j]) {
					temp1 = nums[i];
					nums[i] = nums[j];
					nums[j] = temp1;
				}
			}
		
		//5.출력
		for(int i=0; i<10; i++)
			System.out.printf("%d ", nums[i]);
	}

}
