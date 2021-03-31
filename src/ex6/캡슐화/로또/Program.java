package ex6.캡슐화.로또;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//로또 객체안의 자료형 사용하기
		Lotto lotto = new Lotto();
		
		//로또객체 초기화
		Lotto.init(lotto);
		
		// 로또번호 만들기
		lotto = Lotto.gen(lotto);
		
		// 로또번호 출력
		print(lotto);
		
		// 로또번호 정렬
		Lotto.sort(lotto);
		
		// 정렬된 번호 출력
		print(lotto);

	}
	

	
	//-------------------------------------
	// 로또번호 출력
	//print는 콘솔 출력용이기 때문에 안옮김
	private static void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",Lotto.getNum(x, i));
		}
		System.out.println();
	}
	


}
