package ex3.array;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//배열 생성 후 랜덤 값 넣기
		
		//1.Random객체 생성
		Random rand = new Random();
		
		//2.배열 생성
		int array[] = new int[5];
		
		//3.1~45범위 랜덤값 넣기
		for(int i=0; i<array.length; i++)
			array[i] = rand.nextInt(45)+1;
		
		//3.출력
		for(int i=0; i<array.length; i++)
			System.out.printf("%d ",array[i]);

	}

}
