package ex7.���;

public class LottoConsole {
	private Lotto lotto;
	
	//Compositon Has a ���
	public LottoConsole() {
		lotto = new Lotto(); //�����ֱ� ��ġ
		lotto.gen();
	}
	
	//Association Has a ���
	public LottoConsole(Lotto lotto) {
		this.lotto = lotto;
	}
	
	// �ζǹ�ȣ ���
	public void print() {
		for(int i=0; i<this.lotto.getSize(); i++) {
			System.out.printf("["+"%d"+"] ",this.lotto.getNum(i));
		}
		System.out.println();
	}
}
