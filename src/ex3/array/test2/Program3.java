package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		//���� �о�ͼ� ���ڿ� �ɰ���
		
		//���� �о����
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner scan = new Scanner(fis);
		
		//���ڿ� �ɰ���
		String line = scan.nextLine();
		String[] names = line.split(",");
		
		//���
		for(int i = 0; i<names.length; i++)
			System.out.println(names[i]);
		
		scan.close();
		fis.close();

	}

}
