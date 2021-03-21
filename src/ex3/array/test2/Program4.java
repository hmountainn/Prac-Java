package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {
		//������ ������ �о�ͼ� ���ϴ� ���� ����
		//���� �˻������� �� ���ϱ�
		
		//���� �о����
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//������ ������
		scan.nextLine();
		
		//�迭����
		String line;
		String[][] lines = new String[76][];
		
		//������ ���ڵ�� ���ϱ�
		int count=0;
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			lines[count++] = line.split(","); 
		}
		
		//��¥�� ���� �˻������ڼ� ���
		int sum = 0;
		for(int i = 0; i<count; i++) {
			sum = sum + Integer.parseInt(lines[i][3]);
			System.out.println("------------------------");
			System.out.printf("��¥:%s\n", lines[i][0]);
			System.out.printf("���� �˻������ڼ�:%d\n", sum);
		}
		
		scan.close();
		fis.close();

	}

}
