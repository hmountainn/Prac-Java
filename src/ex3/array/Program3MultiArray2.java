package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray2 {

	public static void main(String[] args) throws IOException {
		//2���� �迭 ����ؼ� 2��° �ٱ��� ��� + �ݺ���
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
				
		//���� ������
		scan.nextLine();
		
		//2���� �迭 ����
		String[][] lines = new String[2][];
		
		//�迭�� �ֱ� (�ݺ�ó��)
		for(int i=0; i<2; i++) {
			String line = scan.nextLine();
			lines[i] = line.split(",");
		}

		
		//��� (�ݺ�ó��)
		for(int j=0; j<2; j++) {
			for(int i=0; i<lines[0].length; i++) {
				if(i==0)
					System.out.printf("%s",lines[j][i]);
				else
					System.out.printf(",%s",lines[j][i]);
			}
			System.out.println();
		}
		
	}	
}


