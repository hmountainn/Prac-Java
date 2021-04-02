package ex7.상속.IS_A;

import ex7.상속.Lotto;

//Lotto상속 받아 함수 수정/추가하기
//Is a 상속
public class Lotto2 extends Lotto {
	
	
	public Lotto2() { //생성자
		
	}
	
	//Override해서 수정하기
	@Override
	public void gen() {
		System.out.println("gen 수정");
	}
	
	public void sortDsc() {
		
	}
}
