package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//If�� ����ϱ�
		
		//1.����ڷκ��� ���� �� �Է¹޾� ����x�� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int x = scan.nextInt();
		
		//2-1. ���࿡ �� ���� ¦���� "¦�� ��"�̶�� ���ڿ��� ����Ѵ�
		if(x%2==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
	}

}
