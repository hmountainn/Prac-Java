package ex7.상속.IS_A;

import ex6.캡슐화.로또.객체지향.Lotto;

public class Lotto2Program {

	public static void main(String[] args) {
		Lotto2 lotto2 = new Lotto2();
		
		//lotto2에서 수정한 함수 사용
		lotto2.gen();
		
		for(int i=0; i<lotto2.getSize(); i++) {
			System.out.printf("["+"%d"+"]", lotto2.getNum(i));
		}

	}

}
