package ex6.ĸ��ȭ.�ζ�.��ü����;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//static�޼ҵ�(�Լ�����)���� �ν��Ͻ� �޼ҵ�(��ü����)�� �ٲٱ�
		
		//�ζ� ��ü���� �ڷ��� ����ϱ�
		Lotto lotto = new Lotto();
		
		//�ζǰ�ü �ʱ�ȭ
		lotto.init();
		
		// �ζǹ�ȣ �����
		lotto.gen();
		
		// �ζǹ�ȣ ���
		print(lotto);
		
		// �ζǹ�ȣ ����
		lotto.sort();
		
		// ���ĵ� ��ȣ ���
		print(lotto);

	}
	

	
	//-------------------------------------
	// �ζǹ�ȣ ���
	//print�� main�޼ҵ� �ȿ� �ֱ⶧���� �Ķ���ͷ� �޾ƾ���(this��� x)
	private static void print(Lotto x) {
		for(int i=0; i<Lotto.getSize(x); i++) {
			System.out.printf("["+"%d"+"] ",x.getNum(i));
		}
		System.out.println();
	}
	


}
