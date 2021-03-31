package ex6.캡슐화.로또.객체지향.생성자;

public class LottoConsole {
	// 로또번호 출력
	//static으로 변경
	public static void print(Lotto x) {
		for(int i=0; i<x.getSize(); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
}
