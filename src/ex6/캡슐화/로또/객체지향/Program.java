package ex6.캡슐화.로또.객체지향;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//static메소드(함수지향)에서 인스턴스 메소드(객체지향)로 바꾸기
		
		//로또 객체안의 자료형 사용하기
		Lotto lotto = new Lotto();
		
		//size설정 (사용자)
		lotto.setSize(6);
		
		//로또객체 초기화
		lotto.init();
		
		// 로또번호 만들기
		lotto.gen();
		
		// 로또번호 출력
		LottoConsole.print(lotto);
		
		// 로또번호 정렬
		lotto.sort();
		
		// 정렬된 번호 출력
		LottoConsole.print(lotto);

	}



}
