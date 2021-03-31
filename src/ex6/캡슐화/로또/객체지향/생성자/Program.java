package ex6.캡슐화.로또.객체지향.생성자;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//생성자 설정(init ,setSize삭제)
		
		//로또 객체안의 자료형 사용하기
		Lotto lotto = new Lotto();
		
		//LottoConsole객체 사용
		LottoConsole lottocon = new LottoConsole();
		
		// 로또번호 만들기
		lotto.gen();
		
		// 로또번호 출력
		lottocon.print(lotto);
		
		// 로또번호 정렬
		lotto.sort();
		
		// 정렬된 번호 출력
		lottocon.print(lotto);

	}



}
