package ex6.ĸ��ȭ.�ζ�.��ü����;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//static�޼ҵ�(�Լ�����)���� �ν��Ͻ� �޼ҵ�(��ü����)�� �ٲٱ�
		
		//�ζ� ��ü���� �ڷ��� ����ϱ�
		Lotto lotto = new Lotto();
		
		//size���� (�����)
		lotto.setSize(6);
		
		//�ζǰ�ü �ʱ�ȭ
		lotto.init();
		
		// �ζǹ�ȣ �����
		lotto.gen();
		
		// �ζǹ�ȣ ���
		LottoConsole.print(lotto);
		
		// �ζǹ�ȣ ����
		lotto.sort();
		
		// ���ĵ� ��ȣ ���
		LottoConsole.print(lotto);

	}



}
