package ex6.ĸ��ȭ.�ζ�;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//�ζ� ��ü���� �ڷ��� ����ϱ�
		Lotto lotto = new Lotto();
		
		//�ζǰ�ü �ʱ�ȭ
		Lotto.init(lotto);
		
		// �ζǹ�ȣ �����
		lotto = Lotto.gen(lotto);
		
		// �ζǹ�ȣ ���
		print(lotto);
		
		// �ζǹ�ȣ ����
		Lotto.sort(lotto);
		
		// ���ĵ� ��ȣ ���
		print(lotto);

	}
	

	
	//-------------------------------------
	// �ζǹ�ȣ ���
	//print�� �ܼ� ��¿��̱� ������ �ȿű�
	private static void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",Lotto.getNum(x, i));
		}
		System.out.println();
	}
	


}
