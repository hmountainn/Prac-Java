package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		//파일 읽어와서 문자열 쪼개기
		
		//파일 읽어오기
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner scan = new Scanner(fis);
		
		//문자열 쪼개기
		String line = scan.nextLine();
		String[] names = line.split(",");
		
		//출력
		for(int i = 0; i<names.length; i++)
			System.out.println(names[i]);
		
		scan.close();
		fis.close();

	}

}
