package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		//�ؽ�Ʈ���Ͽ��� ���ڿ� �Է¹޾� �迭�� �ְ� ���
		
		//1.���ڿ� 10��¥�� �迭 names ����
		String[] names = new String[10];
		
		//2.���Ͽ��� �̸� �о�ͼ� names�� ���� �ϰ� �ٷ� ���
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner scan = new Scanner(fis);
		
		int i=0;
		while(scan.hasNextLine()) {
			names[i++] = scan.nextLine();
			
			System.out.printf(names[i-1]);
		}
		
		scan.close();
		fis.close();
		

	}

}
