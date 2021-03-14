package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//If문 사용하기
		
		//1.사용자로부터 정수 값 입력받아 변수x에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int x = scan.nextInt();
		
		//2.만약 x가 3보다 크면 문자열"큰 값" 출력
		if(x>3)
			System.out.println("큰 값");
		else
			System.out.println("작은 값");
	}

}
