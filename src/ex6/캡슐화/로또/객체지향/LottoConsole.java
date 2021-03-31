package ex6.캡슐화.로또.객체지향;

public class LottoConsole {
	// 로또번호 출력
	//static함수 print옮김
	public static void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
}
