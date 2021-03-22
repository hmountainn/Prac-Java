package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) throws IOException {
		//인덱스명으로 날짜별 누적검사진행자 수 찾기
		
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//인덱스명으로 인덱스 넘버 찾기
		String title = scan.nextLine();
		String lines[] = title.split(",");
		
		int idx=0;
		while(!lines[idx].equals("제주 검사진행자수")){
			idx++;
		}
		
		//idx로 누적 검사진행자수 구하기
		String line;
		int sum=0;
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			lines = line.split(",");
			
			sum += Integer.parseInt(lines[idx]);
			
		}
		System.out.printf("누적 검사진행자수:%d",sum);
				
	}

}
