package ex7.상속;

public class LottoConsole {
	private Lotto lotto;
	
	//Compositon Has a 상속
	public LottoConsole() {
		lotto = new Lotto(); //수명주기 일치
		lotto.gen();
	}
	
	//Association Has a 상속
	public LottoConsole(Lotto lotto) {
		this.lotto = lotto;
	}
	
	// 로또번호 출력
	public void print() {
		for(int i=0; i<this.lotto.getSize(); i++) {
			System.out.printf("["+"%d"+"] ",this.lotto.getNum(i));
		}
		System.out.println();
	}
}
