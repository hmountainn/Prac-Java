package ex6.ĸ��ȭ.�ζ�.��ü����;

public class LottoConsole {
	// �ζǹ�ȣ ���
	//static�Լ� print�ű�
	public static void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
}
