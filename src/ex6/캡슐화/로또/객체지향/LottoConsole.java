package ex6.ĸ��ȭ.�ζ�.��ü����;

public class LottoConsole {
	// �ζǹ�ȣ ���
	//static -> instance�� ����
	public void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
}
