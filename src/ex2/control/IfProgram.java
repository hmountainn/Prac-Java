package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//If문 사용하기
		
		//1.사용자로부터 정수 값 입력받아 변수x에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int x = scan.nextInt();
		
		//2-1. 만약에 그 값이 짝수면 "짝수 값"이라는 문자열을 출력한다
		if(x%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
