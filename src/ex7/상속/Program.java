package ex7.상속;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//Has A상속
		
		//로또 객체안의 자료형 사용하기
		Lotto lotto = new Lotto();
		
		
		//LottoConsole객체 사용(Composition Has a 상속)
		LottoConsole lottocon = new LottoConsole();
		lottocon.print(); //LottoConsole 생성자에서 로또번호 만듦
		
		//LottoConsole객체 사용(Association Has a 상속)
		LottoConsole lottocon2 = new LottoConsole(lotto);
		
		// 로또번호 만들기
		lotto.gen();
		
		lottocon2.print();
	}



}
