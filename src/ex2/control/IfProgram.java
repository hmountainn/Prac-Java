package ex2.control;

import java.util.Scanner;

public class IfProgram {

	public static void main(String[] args) {
		//���� if�� ����ϱ�
		
		//1.����ڷκ��� ���� �� �Է¹޾� ����x�� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int x = scan.nextInt();
		
		//2.3�ǹ���� 5�ǹ�� �Ǵ�
		//x�� 3�ǹ��, 5�ǹ�� -> ������ġ�� if ����2��
		if(x%3==0)
			System.out.println("3�� ���");
		if(x%5==0)
			System.out.println("5�� ���");
	}

}
