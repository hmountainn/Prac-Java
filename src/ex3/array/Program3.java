package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		//1차원 배열 사용해서 2번째 줄까지 출력
		
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
				
		//제목 버리기
		scan.nextLine();
		
		
		//변수생성
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		
		//1차원 배열 생성
		String row1[];
		String row2[];
		
		//잘라서 배열에 담기
		row1 = line1.split(",");
		row2 = line2.split(",");
		
		//출력
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
