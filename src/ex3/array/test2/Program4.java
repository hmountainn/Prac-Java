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
		
		//��¥�� ���� �˻������ڼ� ���
		String line;
		int sum = 0;
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			String cols[]=line.split(",");
			
			sum = sum + Integer.parseInt(cols[3]);
			
			System.out.printf("��¥:%s\n", cols[0]);
			System.out.printf("���� �˻������ڼ�:%d\n", sum);
			System.out.println("------------------------");
		}
		
		scan.close();
		fis.close();

	}

}
