package ex6.ĸ��ȭ.�ζ�.��ü����.������;

public class LottoConsole {
	// �ζǹ�ȣ ���
	//static���� ����
	public static void print(Lotto x) {
		for(int i=0; i<x.getSize(); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
}
