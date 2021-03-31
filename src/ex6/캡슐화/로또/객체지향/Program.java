package ex6.캡슐화.로또.객체지향;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//static메소드(함수지향)에서 인스턴스 메소드(객체지향)로 바꾸기
		
		//로또 객체안의 자료형 사용하기
		Lotto lotto = new Lotto();
		
		//로또객체 초기화
		lotto.init();
		
		// 로또번호 만들기
		lotto.gen();
		
		// 로또번호 출력
		print(lotto);
		
		// 로또번호 정렬
		lotto.sort();
		
		// 정렬된 번호 출력
		print(lotto);

	}
	

	
	//-------------------------------------
	// 로또번호 출력
	//print는 main메소드 안에 있기때문에 파라미터로 받아야함(this사용 x)
	private static void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
	


}
