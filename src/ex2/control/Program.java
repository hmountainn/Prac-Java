package ex2.control;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//3�� ������ ���
		//1.scan�̶�� �̸����� Scanner��ü����
		System.out.print("���� �Է��ϼ���:");
		Scanner scan = new Scanner(System.in);
		
		//2.scan�̿��ؼ� ������ �Է� �޾� ����ans�� ���
		int ans;
		ans = scan.nextInt();

		//3.ans���� 3���� ũ�� 2�� �����̸� 3�� x������ ���
		int x = (ans>3) ? 2 : 3;
		
		//4.���� ���� ���
		System.out.println(x);

	}

}
