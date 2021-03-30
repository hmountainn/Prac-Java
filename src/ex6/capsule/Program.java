package ex6.capsule;

public class Program {

	public static void main(String[] args) {
		//다른클래스에서 함수 호출하기
		
		int[] lotto;
		
		// 로또번호 만들기
		lotto = Lotto.gen();
		// 로또번호 출력
		Lotto.print(lotto);
		// 로또번호 정렬
		Lotto.sort(lotto);
		// 정렬된 번호 출력
		Lotto.print(lotto);


	}

}
