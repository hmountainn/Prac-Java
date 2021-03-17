package ex3.array.test;

public class Program {

	public static void main(String[] args) {
		//배열에 순환값 (1,2,3,1,2,3,1,2,3,1) 넣고 출력
		
		//1.정수 10개짜리 nums 배열 생성
		int[] nums = new int[10];
		
		//2.nums에 순환값 채우기
		for(int i = 0; i<10; i++)
			nums[i] = i%3 + 1;
		
		//3.nums 출력
		//출력모양 1,2,3, ... 1
		for(int i=0; i<10; i++)
			if(i<9)
				System.out.printf("%d,", nums[i]);
			else
				System.out.printf("%d", nums[i]);
	}

}
