package ex6.capsule;

public class Program {

	public static void main(String[] args) {
		//�ٸ�Ŭ�������� �Լ� ȣ���ϱ�
		
		int[] lotto;
		
		// �ζǹ�ȣ �����
		lotto = Lotto.gen();
		// �ζǹ�ȣ ���
		Lotto.print(lotto);
		// �ζǹ�ȣ ����
		Lotto.sort(lotto);
		// ���ĵ� ��ȣ ���
		Lotto.print(lotto);


	}

}
