package ex6.ĸ��ȭ.�ζ�.��ü����.������;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//������ ����(init ,setSize����)
		
		//�ζ� ��ü���� �ڷ��� ����ϱ�
		Lotto lotto = new Lotto();
		
		//LottoConsole��ü ���
		LottoConsole lottocon = new LottoConsole();
		
		// �ζǹ�ȣ �����
		lotto.gen();
		
		// �ζǹ�ȣ ���
		lottocon.print(lotto);
		
		// �ζǹ�ȣ ����
		lotto.sort();
		
		// ���ĵ� ��ȣ ���
		lottocon.print(lotto);

	}



}
