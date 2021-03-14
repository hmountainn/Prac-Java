package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//연속 if문 사용하기
		
		//1.사용자로부터 정수 값 입력받아 변수x에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int x = scan.nextInt();
		
		//2.3의배수와 5의배수 판단
		//x가 3의배수, 5의배수 -> 범위겹치면 if 연속2개
		if(x%3==0)
			System.out.println("3의 배수");
		if(x%5==0)
			System.out.println("5의 배수");
	}

}
