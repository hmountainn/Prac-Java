package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//If�� ����ϱ�
		
		//1.����ڷκ��� ���� �� �Է¹޾� ����x�� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int x = scan.nextInt();
		
		//2.���� x�� 3���� ũ�� ���ڿ�"ū ��" ���
		if(x>3)
			System.out.println("ū ��");
		else
			System.out.println("���� ��");
	}

}
