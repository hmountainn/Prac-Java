package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray2 {

	public static void main(String[] args) throws IOException {
		//2차원 배열 사용해서 2번째 줄까지 출력 + 반복문
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
				
		//제목 버리기
		scan.nextLine();
		
		//2차원 배열 생성
		String[][] lines = new String[2][];
		
		//배열에 넣기 (반복처리)
		for(int i=0; i<2; i++) {
			String line = scan.nextLine();
			lines[i] = line.split(",");
		}

		
		//출력 (반복처리)
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


