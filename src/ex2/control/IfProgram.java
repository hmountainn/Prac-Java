package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//if-else문 사용하기
		
		//1.사용자로부터 정수 값 입력받아 변수x에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int x = scan.nextInt();
		
		//2. x가 3보다 작으면 "작은값" 5보다 크면 "큰값"
		//   아무것도 속하지 않으면 "그냥 값" -> 범위 겹치지 않기때문에 if-else문 사용
		if(x<3)
			System.out.print("작은 값");
		else if(x>5)
			System.out.print("큰 값");
		else
			System.out.print("그냥 값");
	}

}
