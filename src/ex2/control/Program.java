package ex2.control;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//3항 연산자 사용
		//1.scan이라는 이름으로 Scanner객체생성
		System.out.print("정수 입력하세요:");
		Scanner scan = new Scanner(System.in);
		
		//2.scan이용해서 정수값 입력 받아 변수ans에 담기
		int ans;
		ans = scan.nextInt();

		//3.ans값이 3보다 크면 2를 거짓이면 3을 x변수에 담기
		int x = (ans>3) ? 2 : 3;
		
		//4.변수 값을 출력
		System.out.println(x);

	}

}
