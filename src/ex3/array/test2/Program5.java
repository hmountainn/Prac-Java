package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) throws IOException {
		//�ε��������� ��¥�� �����˻������� �� ã��
		
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//�ε��������� �ε��� �ѹ� ã��
		String title = scan.nextLine();
		String lines[] = title.split(",");
		
		int idx=0;
		while(!lines[idx].equals("���� �˻������ڼ�")){
			idx++;
		}
		
		//idx�� ���� �˻������ڼ� ���ϱ�
		String line;
		int sum=0;
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			lines = line.split(",");
			
			sum += Integer.parseInt(lines[idx]);
			
		}
		System.out.printf("���� �˻������ڼ�:%d",sum);
				
	}

}
