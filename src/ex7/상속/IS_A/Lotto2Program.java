package ex7.���.IS_A;

import ex6.ĸ��ȭ.�ζ�.��ü����.Lotto;

public class Lotto2Program {

	public static void main(String[] args) {
		Lotto2 lotto2 = new Lotto2();
		
		//lotto2���� ������ �Լ� ���
		lotto2.gen();
		
		for(int i=0; i<lotto2.getSize(); i++) {
			System.out.printf("["+"%d"+"]", lotto2.getNum(i));
		}

	}

}
