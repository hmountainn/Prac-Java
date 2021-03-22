package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray {

	public static void main(String[] args) throws IOException {
		//2차원 배열 사용해서 2번째 줄까지 출력
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
				
		//제목 버리기
		scan.nextLine();
		
		//변수에 담기
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		
		//2차원 배열 생성
		String[][] lines = new String[2][];
		
		//배열에 넣기
		lines[0] = line1.split(",");
		lines[1] = line2.split(",");
		
		//출력
		for(int i=0; i<lines[0].length; i++) {
			if(i==0)
				System.out.printf("%s",lines[0][i]);
			else
				System.out.printf(",%s",lines[0][i]);
					
		}
		System.out.println();
				
		for(int i=0; i<lines[1].length; i++) {
			if(i==0)
				System.out.printf("%s",lines[1][i]);
			else
				System.out.printf(",%s",lines[1][i]);
										
		}	
	}

}
