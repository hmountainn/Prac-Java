package ex7.���;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//Has A���
		
		//�ζ� ��ü���� �ڷ��� ����ϱ�
		Lotto lotto = new Lotto();
		
		
		//LottoConsole��ü ���(Composition Has a ���)
		LottoConsole lottocon = new LottoConsole();
		lottocon.print(); //LottoConsole �����ڿ��� �ζǹ�ȣ ����
		
		//LottoConsole��ü ���(Association Has a ���)
		LottoConsole lottocon2 = new LottoConsole(lotto);
		
		// �ζǹ�ȣ �����
		lotto.gen();
		
		lottocon2.print();
	}



}
