package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		//1���� �迭 ����ؼ� 2��° �ٱ��� ���
		
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
				
		//���� ������
		scan.nextLine();
		
		
		//��������
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		
		//1���� �迭 ����
		String row1[];
		String row2[];
		
		//�߶� �迭�� ���
		row1 = line1.split(",");
		row2 = line2.split(",");
		
		//���
		for(int i=0; i<row1.length; i++) {
			if(i==0)
				System.out.printf("%s",row1[i]);
			else
				System.out.printf(",%s", row1[i]);
			
		}
		System.out.println();
		
		for(int i=0; i<row2.length; i++) {
			if(i==0)
				System.out.printf("%s",row2[i]);
			else
				System.out.printf(",%s", row2[i]);
			
		}
		scan.close();
		fis.close();

	}

}
