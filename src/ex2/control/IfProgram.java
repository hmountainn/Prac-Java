package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//if-else�� ����ϱ�
		
		//1.����ڷκ��� ���� �� �Է¹޾� ����x�� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int x = scan.nextInt();
		
		//2. x�� 3���� ������ "������" 5���� ũ�� "ū��"
		//   �ƹ��͵� ������ ������ "�׳� ��" -> ���� ��ġ�� �ʱ⶧���� if-else�� ���
		if(x<3)
			System.out.print("���� ��");
		else if(x>5)
			System.out.print("ū ��");
		else
			System.out.print("�׳� ��");
	}

}
