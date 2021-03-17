package ex3.array.test;

public class Program {

	public static void main(String[] args) {
		//배열에 짝수 넣고 출력하기
		
		//1.정수 10개짜리 nums 배열 생성
		int[] nums = new int[10];
		
		//2.nums에 숫자를 짝수로 10개 채우기
		for(int i = 0; i<10; i++)
			nums[i] = (i+1)*2;
		
		//3.nums 출력
		//출력모양 2,4,6, ... 20
		for(int i=0; i<10; i++)
			if(i<9)
				System.out.printf("%d,", nums[i]);
			else
				System.out.printf("%d", nums[i]);
	}

}
